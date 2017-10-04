package br.com.silen.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.model.Usuario;
import br.com.silen.service.UsuarioService;

public class InserirUsuario implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		UsuarioService UsuarioService = new UsuarioService();
		
		String nomeUsuario = request.getParameter("nomeUsuario");
		int CPF=  Integer.parseInt(request.getParameter("CPF"));
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
		int numeroUsuario = Integer.parseInt(request.getParameter("numeroUsuario"));
		Usuario Usuario = new Usuario();
		
		Usuario.setNomeUsuario("Ingrid");
		Usuario.setCPF("123");
		Usuario.setDataNascimento(dataNascimento);
		Usuario.setTelResidencial(telResidencial);
		Usuario.setTelCelular(telCelular);
		Usuario.setTelRecado(telRecado);
		Usuario.setEnderecoUsuario(enderecoUsuario);
		Usuario.setComplementoUsuario(complementoUsuario);
		Usuario.setCepUsuario(cepUsuario);
		Usuario.setBairroUsuario(bairroUsuario);
		Usuario.setCidadeUsuario(cidadeUsuario);
		Usuario.setEstadoUsuario(estadoUsuario);
		Usuario.setNumeroUsuario(numeroUsuario);
		
		UsuarioService.inserir(Usuario);
		request.setAttribute("Usuario", Usuario);
		RequestDispatcher rd = request.getRequestDispatcher("ExibeUsuario.jsp");
		rd.forward(request, response);
	}

}
