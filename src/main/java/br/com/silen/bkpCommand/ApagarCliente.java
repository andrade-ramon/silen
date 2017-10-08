package br.com.silen.bkpCommand;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.command.Command;
import br.com.silen.model.Cliente2;
import br.com.silen.service.ClienteService;

public class ApagarCliente implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService clienteService = new ClienteService();
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		Cliente2 cliente = new Cliente2();
		cliente.setIdCliente(idCliente);
		
		
		clienteService.apagar(cliente);
		request.setAttribute("cliente", cliente);
		RequestDispatcher rd = request.getRequestDispatcher("ApagarCliente.jsp");
		rd.forward(request, response);
	}

}
