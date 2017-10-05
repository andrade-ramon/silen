package br.com.silen.motoboy;

import java.util.List;

import org.springframework.composed.web.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import br.com.silen.entregas.Entrega;
import br.com.silen.entregas.EntregasService;

@Controller
public class MotoboyController {
	
	@Get("/motoboy_entregas")
	public ModelAndView motoboyEntregas(){
		EntregasService entregasService = new EntregasService();
		List<Entrega> entregas = entregasService.listarEntregasDe(1);
	
		ModelAndView modelAndView = new ModelAndView("motoboy/entregas");
		
		modelAndView.addObject("entregas", entregas);
		
		return modelAndView;
	}
	
}	
