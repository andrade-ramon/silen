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
 * Servlet implementation class AlteracaoUsuarioControl
 */
@WebServlet("/usuario/alteracaoUsuario.do")
public class AlteracaoUsuarioControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlteracaoUsuarioControl() {
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
		//usuario.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
		usuario.setNomeUsuario(request.getParameter("nomeUsuario"));
		usuario.setCPF(request.getParameter("cpfUsuario"));
		usuario.setDataNascimento(request.getParameter("dataNascimento"));
		usuario.setTelResidencial(request.getParameter("telResidencial"));
		usuario.setTelCelular(request.getParameter("telCelular"));
		usuario.setTelRecado(request.getParameter("telRecado"));
		usuario.setEnderecoUsuario(request.getParameter("enderecoUsuario"));
		usuario.setComplementoUsuario(request.getParameter("complementoUsuario"));
		usuario.setCepUsuario(request.getParameter("cepUsuario"));		
		usuario.setBairroUsuario(request.getParameter("bairroUsuario"));
		usuario.setCidadeUsuario(request.getParameter("cidadeUsuario"));
		usuario.setEstadoUsuario(request.getParameter("estadoUsuario"));
		usuario.setNumeroUsuario(Integer.parseInt(request.getParameter("numeroUsuario")));
				
		UsuarioService usuarioService = new UsuarioService();

		//Boolean para informar usuario se alterou ou nao
	
			if(usuarioService.alterar(usuario))
			{			
				request.setAttribute("alterado", true);
				request.setAttribute("usuarioConsultado", usuario);
			}
			else
			{
				
				request.setAttribute("alterado", false);
			}
		
		//Volta para a mesma tela de detalhes para tratar se alterou ou nao
		RequestDispatcher view = request.getRequestDispatcher("detalhes.do?cpfUsuario=" + usuario.getCPF());
		view.forward(request, response);
		
		
	}

}
