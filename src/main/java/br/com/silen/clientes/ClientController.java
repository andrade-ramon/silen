package br.com.silen.clientes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Get;
import org.springframework.composed.web.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ClientController {
	
	@Autowired
	private ClientRespository clienteRespository; 
	
	@Get("/clientes")
	public ModelAndView listClients(){
		List<Client> clients = clienteRespository.findAll();
		
		ModelAndView modelAndView = new ModelAndView("client/list");
		modelAndView.addObject("clients", clients);
		
		return modelAndView;
	}
	
	@Get("/cliente/{id}")
	public ModelAndView getClientById(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		Optional<Client> client = clienteRespository.findById(id);
		
		if (!client.isPresent()) {
			redirectAttributes.addFlashAttribute("showClientNotFound", true);
			return new ModelAndView("client/edit");
		}
		
		ModelAndView modelAndView = new ModelAndView("client/edit");
		modelAndView.addObject("client", client.get());
		return modelAndView;
	}
	
	@Get("/cliente")
	public ModelAndView newClient() {
		ModelAndView modelAndView = new ModelAndView("client/edit");
		return modelAndView;
	}
	
	@Post("/clientes")
	public ModelAndView updateClient(@ModelAttribute Client client){
		System.out.println(client.getId());
		clienteRespository.save(client);
		return new ModelAndView("redirect:/clientes");
	}
	
	@Get("/cliente/{id}/excluir")
	public ModelAndView deleteClientById(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		Optional<Client> client = clienteRespository.findById(id);
		
		if (!client.isPresent()) {
			redirectAttributes.addFlashAttribute("showClientNotFound", true);
		} else {
			clienteRespository.delete(client.get());
		}
		return new ModelAndView("redirect:/clientes");
	}
}
