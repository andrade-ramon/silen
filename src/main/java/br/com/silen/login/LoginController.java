package br.com.silen.login;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Get;
import org.springframework.composed.web.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.silen.user.User;
import br.com.silen.user.UserRepository;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;

	@Get("/")
	public String index() {
		return "login/index";
	}
	
	@Post("/login")
	public ModelAndView login(@RequestParam String username, @RequestParam String password,  RedirectAttributes redirectAttributes) {
		Optional<User> user = userRepository.findByUsernameAndPassword(username, password);
		
		if (!user.isPresent()) {
			redirectAttributes.addFlashAttribute("showInvalidLoginMessage", true);
			
			return new ModelAndView("redirect:/");
		}
		
		ModelAndView modelAndView = new ModelAndView("redirect:/home");
		
		modelAndView.addObject("loggedUser", user.get());
		
		return modelAndView;
	}

}
