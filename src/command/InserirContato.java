package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contato;
import service.ContatoService;

public class InserirContato implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ContatoService ContatoService = new ContatoService();
		
		String nomeContato = request.getParameter("nomeContato");
		String emailContato =  request.getParameter("emailContato");
		String comentario = request.getParameter("comentario");

		Contato Contato = new Contato();
		
		Contato.setNomeContato(nomeContato);
		Contato.setEmailContato(emailContato);
		Contato.setComentario(comentario);
		
		
		ContatoService.criar(Contato);
		request.setAttribute("Contato", Contato);
		RequestDispatcher rd = request.getRequestDispatcher("ExibeContato.jsp");
		rd.forward(request, response);
	}

}
