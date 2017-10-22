package br.com.silen.entregas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Get;
import org.springframework.composed.web.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.com.silen.caixa.Caixa;
import br.com.silen.caixa.CaixaRepository;
import br.com.silen.clientes.Client;
import br.com.silen.clientes.ClientRespository;
import br.com.silen.security.OnlyAdmin;

@Controller
public class EntregasController {
	
	@Autowired
	private EntregaRepository entregaRespository;
	@Autowired
	private ClientRespository clientRepository;
	@Autowired
	private CaixaRepository caixaRepository;
	
	@Get("/entregas")
	@OnlyAdmin
	public ModelAndView listClients(){
		List<Entrega> entregas = entregaRespository.findAll();
		
		ModelAndView modelAndView = new ModelAndView("entrega/list");
		modelAndView.addObject("entregas", entregas);
		
		return modelAndView;
	}
	
	@Get("/entrega/{id}")
	@OnlyAdmin
	public ModelAndView findEntregaById(@PathVariable Long id) {
		List<Client> clientes = clientRepository.findAll();
		List<Caixa> caixas = caixaRepository.findAll();
		Optional<Entrega> entrega = entregaRespository.findById(id);
		
		ModelAndView modelAndView = new ModelAndView("entrega/edit");
		if (!entrega.isPresent()) {
			modelAndView.addObject("showEntregaNotFound", true);
			return modelAndView;
		}
		
		modelAndView.addObject("clientes", clientes);
		modelAndView.addObject("caixas", caixas);
		modelAndView.addObject("entrega", entrega.get());
		return modelAndView;
	}
	

	@OnlyAdmin
	@Get("/entrega")
	public ModelAndView newEntrega() {
		List<Client> clients = clientRepository.findAll();
		List<Caixa> caixas = caixaRepository.findAll();
		
		ModelAndView modelAndView = new ModelAndView("entrega/new");
		modelAndView.addObject("clientes", clients);
		modelAndView.addObject("caixas", caixas);
		 
		return modelAndView;
	}
	
	@Post("/entregas")
	public ModelAndView createEntrega(@ModelAttribute EntregaDTO entrega){
		System.out.println(entrega);
		return new ModelAndView("redirect:/entregas");
	}
}
