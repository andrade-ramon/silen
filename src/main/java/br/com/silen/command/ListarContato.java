package br.com.silen.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.model.Contato;
import br.com.silen.service.ContatoService;


public class ListarContato implements Command{
	
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ContatoService service = new ContatoService();
		List <Contato> contato = service.listarCompleto();
		request.setAttribute("contato", contato);
		request.getRequestDispatcher("ExibeContato.jsp").forward(request, response);
	}

}