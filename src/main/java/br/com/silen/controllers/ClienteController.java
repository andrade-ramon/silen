package br.com.silen.controllers;

import java.util.List;

import org.springframework.composed.web.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.silen.model.Cliente;
import br.com.silen.service.ClienteService;

@Controller
public class ClienteController {

	@Get("/pesquisar")
	public ModelAndView search(@RequestParam("idCliente") Integer idCliente, @RequestParam("nomeCliente") String nomeCliente) {
		ModelAndView modelAndView = new ModelAndView("cliente/search");

		try {
			ClienteService clienteService = new ClienteService();

			Cliente clientes = new Cliente();
			clientes.setIdCliente(idCliente);
			clientes.setNomeCliente(nomeCliente);

			List<Cliente> cliente = clienteService.pesquisarCliente(idCliente, nomeCliente);

			modelAndView.addObject("cliente", cliente);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}

	@Get("/excluir")
	public ModelAndView delete(@RequestParam("idCliente") Integer idCliente) {
		ModelAndView modelAndView = new ModelAndView("cliente/delete");

		ClienteService clienteService = new ClienteService();
		Cliente cliente = new Cliente();
		cliente.setIdCliente(idCliente);

		clienteService.apagar(cliente);

		modelAndView.addObject("cliente", cliente);

		return modelAndView;
	}

}
