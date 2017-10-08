package br.com.silen.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.model.Cliente2;
import br.com.silen.service.ClienteService;

public class Cliente_Listar implements Command {
	
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService service = new ClienteService();
		List <Cliente2> cliente = service.listarCompleto();
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("adm_cliente.jsp").forward(request, response);
	}

}
