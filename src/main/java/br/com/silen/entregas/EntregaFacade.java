package br.com.silen.entregas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.silen.caixa.Caixa;
import br.com.silen.caixa.CaixaRepository;
import br.com.silen.clientes.Client;
import br.com.silen.clientes.ClientRepository;
import br.com.silen.geolocation.GeolocationService;
import br.com.silen.geolocation.Location;
import br.com.silen.motoboy.Motoboy;
import br.com.silen.motoboy.MotoboyRepository;

@Component
public class EntregaFacade {
	
	private static int MAX_BOX_SIZE = 40;
	
	@Autowired
	private EntregaRepository entregaRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CaixaRepository caixaRepository;
	
	@Autowired
	private MotoboyRepository motoboyRepository;
	
	@Autowired
	private GeolocationService geolocationService;
	
	public void create(EntregaDTO entregaDTO) {
		Client client = clientRepository.findById(entregaDTO.getClienteId()).get();		
		Caixa caixa = caixaRepository.findById(entregaDTO.getCaixaId()).get();
		
		Location location = geolocationService.retrieveLocationFrom(client.getEndereco()).get();
		Motoboy motoboy = findBestMotoboy(caixa, entregaDTO.getQuantidadeCaixa());
		
		Entrega entregaToSave = new Entrega(client, motoboy, caixa, location, entregaDTO.getQuantidadeCaixa());
		
		entregaRepository.save(entregaToSave);
	}
	
	
	private Motoboy findBestMotoboy(Caixa caixa, Integer quantidadeCaixa) {
		Integer tamanhoNovaEntrega = quantidadeCaixa * caixa.getTamanho();
		
		List<Motoboy> motoboys = motoboyRepository.findAvailableMotoboys();
		if(motoboys.size() == 1) {
			return motoboys.get(0);
		} 
		
		Motoboy bestMotoboy = null;
		
		for (Motoboy motoboy : motoboys) {
			List<Entrega> entregas = entregaRepository.findOpenEntregasByMotoboyId(motoboy.getId());
			
			int totalTamanho = 0;
			for (Entrega entrega : entregas) {
				totalTamanho += (entrega.getCaixa().getTamanho() * entrega.getQuantidadeCaixa());
			}
			
			if((totalTamanho + tamanhoNovaEntrega) <= MAX_BOX_SIZE) {
				bestMotoboy = motoboy;
				break;
			}
		}
		if(bestMotoboy == null) {
			throw new RuntimeException("Nenhum motoboy disponível");
		}
		
		return bestMotoboy;
	}
	 
}
