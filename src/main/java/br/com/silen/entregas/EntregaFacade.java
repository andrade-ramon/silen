package br.com.silen.entregas;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.cache.spi.access.EntityRegionAccessStrategy;
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
		Motoboy motoboy = findBestMotoboy(location);
		
		Entrega entregaToSave = new Entrega(client, motoboy, caixa, location, entregaDTO.getQuantidadeCaixa());
		
		entregaRepository.save(entregaToSave);
	}
	
	
	private Motoboy findBestMotoboy(Location location) {
		List<Motoboy> motoboys = motoboyRepository.findAvailableMotoboys();
		if(motoboys.size() == 1) {
			return motoboys.get(0);
		}
		
//		List<Entrega> entregas = entregaRepository.findAllByMotoboyIds(motoboys
//				.stream()
//				.map(Motoboy::getId)
//				.collect(Collectors.toList()));
		
//		for (Motoboy motoboy : motoboys) {
//			entregaRepository.findAllByMotoboyUserId(motoboy.getUser().getId());
//		}
		
		Motoboy motoboy = motoboyRepository.findById(1L).get();		
		return motoboy;
	}
	 
}
