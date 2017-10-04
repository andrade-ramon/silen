package command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import service.ClienteService;

@WebServlet ("/PesquisarClienteServlet")
public class Cliente_PesquisarCliente implements Command{
	
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		try{
		ClienteService clienteService = new ClienteService();
		int idCliente = 0;
		String nomeCliente = "";

		if(request.getParameter("idCliente") != ""){
			idCliente = Integer.parseInt(request.getParameter("idCliente"));
		}
		if(request.getParameter("nomeCliente") != ""){
			nomeCliente = request.getParameter("nomeCliente");
		}
		Cliente clientes = new Cliente();
		clientes.setIdCliente(idCliente);
		clientes.setNomeCliente(nomeCliente);
				
		List <Cliente> cliente = clienteService.pesquisarCliente(idCliente,nomeCliente);
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("adm_cliente.jsp").forward(request, response);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
