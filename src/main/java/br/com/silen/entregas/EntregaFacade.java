package br.com.silen.entregas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.silen.caixa.Caixa;
import br.com.silen.caixa.CaixaNotFoundException;
import br.com.silen.caixa.CaixaRepository;
import br.com.silen.clientes.Client;
import br.com.silen.geolocation.Location;
import br.com.silen.motoboy.Motoboy;
import br.com.silen.motoboy.MotoboyNotFoundException;
import br.com.silen.motoboy.MotoboyRepository;

@Component
public class EntregaFacade {
	
	@Autowired
	private EntregaRepository entregaRespository;
	@Autowired
	private CaixaRepository caixaRepository;
	@Autowired
	private MotoboyRepository motoboyRepository;
	
	public void create(EntregaDTO entregaDTO, Client client, Location location) {
		Caixa caixa = caixaRepository.findById(entregaDTO.getCaixaId()).orElseThrow(CaixaNotFoundException::new);
		Motoboy motoboy = motoboyRepository.findById(1L).orElseThrow(MotoboyNotFoundException::new);
		
		Entrega entregaToSave = new Entrega(client, motoboy, caixa, location.getLatitude(), location.getLongitude(), Double.valueOf(1.0), entregaDTO.getQuantidadeCaixa(), EntregaStatus.OPEN);
		
		Entrega entrega = entregaRespository.save(entregaToSave);
		System.out.println("Salvou a entrega" + entrega);
	}
	
}
