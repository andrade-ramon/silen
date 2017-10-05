package br.com.silen.admin;

import java.util.List;

import org.springframework.composed.web.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import br.com.silen.entregas.Entrega;
import br.com.silen.entregas.EntregasService;


@Controller
public class AdminController {
	
	@Get("/adm_entregas")
	public ModelAndView entregasAdm() {
		EntregasService entregasService = new EntregasService();
		List<Entrega> entregas = entregasService.listarTodasEntregas();
		
	
		ModelAndView modelAndView = new ModelAndView("admin/entregas");
		
		modelAndView.addObject("entregas", entregas);
		return modelAndView;
	}
}
