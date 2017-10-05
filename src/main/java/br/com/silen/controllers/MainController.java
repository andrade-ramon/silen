package br.com.silen.controllers;
import org.springframework.composed.web.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import br.com.silen.user.User;

@Controller
public class MainController {
	
	@Get("/inicio")
	public ModelAndView inicio() {
		User user = new User(1l, "Ramon", "ramon.andrade@elo7.com");
	
		ModelAndView modelAndView = new ModelAndView("main/page");
		modelAndView.addObject("user", user);
		
		return modelAndView;
	}
}
