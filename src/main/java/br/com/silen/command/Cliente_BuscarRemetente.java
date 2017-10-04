package br.com.silen.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.model.Cliente;
import br.com.silen.service.ClienteService;

public class Cliente_BuscarRemetente implements Command{
	
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService clienteService = new ClienteService();
		int idCliente = Integer.parseInt(request.getParameter("idRemetente"));
		int CPFCNPJ = Integer.parseInt(request.getParameter("txtCPFRemetente"));
		String nomeCliente = request.getParameter("txtRemetente");
		
		
		Cliente cliente = clienteService.buscarCliente(idCliente,CPFCNPJ, nomeCliente);
		request.setAttribute("txtEnderecoRemetente", cliente.getEnderecoCliente());
		request.getRequestDispatcher("ExibeBuscarCliente.jsp").forward(request, response);
			
		
	}

}
