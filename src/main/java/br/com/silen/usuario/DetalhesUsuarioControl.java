package br.com.silen.usuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.model.Usuario;
import br.com.silen.service.UsuarioService;


@WebServlet("/usuario/detalhes.do")
public class DetalhesUsuarioControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int cpf;

		if (request.getParameter("cpfUsuario") != null || request.getParameter("cpfUsuario").length() != 0) {
			cpf = Integer.parseInt(request.getParameter("cpfUsuario"));
		} else {
			// Mandar pra tela de erro depois
			cpf = 0;
		}

		Usuario usuario = new Usuario();
		UsuarioService usuarioService = new UsuarioService();
		usuario = usuarioService.consultar(cpf);

		// Se n�o existir usuario n�o fazer nada
		if (usuario == null) {
			// Apenas para teste
			RequestDispatcher view = request.getRequestDispatcher("consulta.jsp");
			view.forward(request, response);
		} else { // Se existir usuario, setar o atributo e ir para a tela de detalhes
			request.setAttribute("usuarioConsultado", usuario);
			RequestDispatcher view = request.getRequestDispatcher("detalhes.jsp");
			view.forward(request, response);
		}

	}

}
