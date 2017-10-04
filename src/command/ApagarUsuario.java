package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import service.UsuarioService;

public class ApagarUsuario implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		UsuarioService usuarioService = new UsuarioService();
		String cpf = request.getParameter("cpf");
		Usuario usuario = new Usuario();
		usuario.setCPF(cpf);
		
		
		usuarioService.excluir(usuario);
		request.setAttribute("usuario", usuario);
		RequestDispatcher rd = request.getRequestDispatcher("ApagarUsuario.jsp");
		rd.forward(request, response);
	}

}
