package br.com.silen.entregas;

import java.util.List;

import org.springframework.composed.web.Get;
import org.springframework.composed.web.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EntregasController {
	
	@Get("/entregas")
	public ModelAndView list() {
		EntregasService entregasService = new EntregasService();
		List<Entrega> entregas = entregasService.listarTodasEntregas();

		ModelAndView modelAndView = new ModelAndView("entregas/list");

		modelAndView.addObject("entregas", entregas);

		return modelAndView;
	}

	@Post("/editar_entrega")
	public ModelAndView edit(@RequestParam(value = "idEntrega") Integer idEntrega) {

		EntregasService entregasService = new EntregasService();
		Entrega entrega = entregasService.findById(idEntrega);

		ModelAndView modelAndView = new ModelAndView("entregas/edit");

		modelAndView.addObject("entrega", entrega);

		return modelAndView;
	}

}
