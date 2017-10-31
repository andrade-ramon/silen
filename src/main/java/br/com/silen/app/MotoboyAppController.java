package br.com.silen.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Get;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.silen.entregas.Entrega;
import br.com.silen.entregas.EntregaRepository;
import br.com.silen.security.App;

@RestController
public class MotoboyAppController {
		
	@Autowired
	private EntregaRepository entregaRepository;
	
	@App
	@Get("/app/minhas-entregas/{userId}")
	public List<Entrega> getEntregas(@PathVariable Long userId) {
		List<Entrega> entregas = entregaRepository.findAllByMotoboyUserId(userId);
		
		return entregas;
	}
		
	@App
	@Get("/app/entrega/{id}/start")
	public void startEntrega(@PathVariable Long id) {
		Entrega entrega = entregaRepository.findById(id).get();
		
		entrega.markAsStarted();
		entregaRepository.save(entrega);			
	}
	
	@App
	@Get("/app/entrega/{id}/finish")
	public void finishEntrega(@PathVariable Long id) {
		Entrega entrega = entregaRepository.findById(id).get();
		
		entrega.markAsFinished();
		entregaRepository.save(entrega);
	}
}
