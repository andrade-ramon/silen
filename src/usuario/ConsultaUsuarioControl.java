package usuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UsuarioService;
import to.UsuarioTO;

import model.*;


/**
 * Servlet implementation class ConsultaUsuarioControl
 */
@WebServlet("/usuario/consultaUsuario.do")
public class ConsultaUsuarioControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaUsuarioControl() {
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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		int cpf;
		
		if(request.getParameter("cpfUsuario") != null || request.getParameter("cpfUsuario").length() != 0)
		{
			System.out.print(request.getParameter("cpfUsuario"));
			cpf = Integer.parseInt(request.getParameter("cpfUsuario"));
		}
		else
		{
			//Mandar pra tela de erro depois
			cpf = 0;	
		}

		
		UsuarioTO usuarioTO = new UsuarioTO();
		UsuarioService usuarioService = new UsuarioService();		
		usuarioTO.add(usuarioService.consultar(cpf));	

		if(usuarioTO.getLista().size() == 0){
			usuarioTO = new UsuarioTO();
		}
		
		request.setAttribute("listaUsuarios",usuarioTO);
		
		RequestDispatcher view = request.getRequestDispatcher("/usuario/consulta.jsp");
		view.forward(request, response);
	}

}
