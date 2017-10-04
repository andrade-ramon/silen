package bkpCommand;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import model.Cliente;
import service.ClienteService;

public class ListarCliente implements Command{
	
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService service = new ClienteService();
		List <Cliente> cliente = service.listarCompleto();
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("ExibeClientes.jsp").forward(request, response);
	}

}
