package usuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UsuarioService;

import model.Usuario;

/**
 * Servlet implementation class ExclusaoUsuarioControl
 */
@WebServlet("/usuario/exclusaoUsuario.do")
public class ExclusaoUsuarioControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExclusaoUsuarioControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		Usuario usuario = new Usuario();
		usuario.setCPF(request.getParameter("cpfUsuario"));		
		
		UsuarioService usuarioService = new UsuarioService();

		usuarioService.excluir(usuario);
		
		RequestDispatcher view = request.getRequestDispatcher("/usuario/exclusao-sucesso.html");
		view.forward(request, response);
	}

}
