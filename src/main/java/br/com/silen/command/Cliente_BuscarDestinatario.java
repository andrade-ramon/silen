package br.com.silen.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.model.Cliente2;
import br.com.silen.service.ClienteService;

public class Cliente_BuscarDestinatario implements Command{
	
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService clienteService = new ClienteService();
		int idCliente = Integer.parseInt(request.getParameter("idDestinatario"));
		int CPFCNPJ = Integer.parseInt(request.getParameter("txtCPFDestinatario"));
		String nomeCliente = request.getParameter("txtDestinatario");
		
		
		Cliente2 cliente = clienteService.buscarCliente(idCliente,CPFCNPJ, nomeCliente);
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("ExibeBuscarCliente.jsp").forward(request, response);
		
		
	}

}
