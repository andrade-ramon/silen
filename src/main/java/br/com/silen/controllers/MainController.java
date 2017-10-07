package br.com.silen.controllers;
import org.springframework.composed.web.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import br.com.silen.user.User;
import br.com.silen.user.UserType;

@Controller
public class MainController {
	
	@Get("/inicio")
	public ModelAndView inicio() {
		User user = new User("Ramon", "ramon.andrade@elo7.com", "ramon", UserType.ADMIN);
	
		ModelAndView modelAndView = new ModelAndView("main/page");
		modelAndView.addObject("user", user);
		
		return modelAndView;
	}
}
