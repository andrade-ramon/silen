package br.com.silen.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.model.Cliente;
import br.com.silen.service.ClienteService;

@WebServlet("/ExcluirCliente")
public class Cliente_Apagar implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService clienteService = new ClienteService();
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		Cliente cliente = new Cliente();
		cliente.setIdCliente(idCliente);
		
		
		clienteService.apagar(cliente);
		request.setAttribute("cliente", cliente);
		RequestDispatcher rd = request.getRequestDispatcher("ApagarCliente.jsp");
		rd.forward(request, response);
	}

}
