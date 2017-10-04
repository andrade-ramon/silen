package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import service.UsuarioService;

public class AtualizarUsuario implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		UsuarioService usuarioService = new UsuarioService();
		int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
		String nomeUsuario = request.getParameter("nomeUsuario");
		String cpf = request.getParameter("cpf");
		String dataNascimento = request.getParameter("dataNascimento");
		String telResidencial = request.getParameter("telResidencial");
		String telCelular = request.getParameter("telCelular");
		String telRecado = request.getParameter("telRecado");
		String enderecoUsuario = request.getParameter("enderecoUsuario");
		String complementoUsuario = request.getParameter("complementoUsuario");
		String cepUsuario = request.getParameter("cepUsuario");
		String bairroUsuario = request.getParameter("bairroUsuario");
		String cidadeUsuario = request.getParameter("cidadeUsuario");
		String estadoUsuario = request.getParameter("estadoUsuario");
		
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(idUsuario);
		usuario.setNomeUsuario(nomeUsuario);
		usuario.setCPF(cpf);
		usuario.setDataNascimento(dataNascimento);
		usuario.setTelResidencial(telResidencial);
		usuario.setTelCelular(telCelular);
		usuario.setTelRecado(telRecado);
		usuario.setEnderecoUsuario(enderecoUsuario);
		usuario.setComplementoUsuario(complementoUsuario);
		usuario.setCepUsuario(cepUsuario);
		usuario.setBairroUsuario(bairroUsuario);
		usuario.setCidadeUsuario(cidadeUsuario);
		usuario.setEstadoUsuario(estadoUsuario);
		
		usuarioService.alterar(usuario);
		request.setAttribute("usuario", usuario);
		RequestDispatcher rd = request.getRequestDispatcher("AtualizarLivro.jsp");
		rd.forward(request, response);
	}

}
