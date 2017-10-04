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
 * Servlet implementation class CadastroUsuarioControl
 */
@WebServlet("/usuario/cadastroUsuario.do")
public class CadastroUsuarioControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroUsuarioControl() {
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
		
		Usuario usuario = new Usuario();
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
		
		if(usuarioService.inserir(usuario)){
			System.out.println("Deu certo o cad");
		}else{
			System.out.println("não certo o cad");
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/usuario/cadastro-sucesso.html");
		view.forward(request, response);
	}

}
