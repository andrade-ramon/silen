package bkpCommand;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import model.Cliente;
import service.ClienteService;

public class InserirCliente implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService ClienteService = new ClienteService();
		
		String nomeCliente = request.getParameter("nomeCliente");
		String CPFCNPJ =  request.getParameter("CPFCNPJ");
		String telCelular = request.getParameter("telCelular");
		String telFixo = request.getParameter("telFixo");
		String telRecado = request.getParameter("telRecado");
		String email = request.getParameter("email");
		String enderecoCliente = request.getParameter("enderecoCliente");
		String numeroCliente = request.getParameter("numeroCliente");
		String complementoCliente = request.getParameter("complementoCliente");
		String bairroCliente = request.getParameter("bairroCliente");
		String cidadeCliente = request.getParameter("cidadeCliente");
		String estadoCliente = request.getParameter("estadoCliente");
		String cepCliente = request.getParameter("cepCliente");
		
		Cliente Cliente = new Cliente();
		
		Cliente.setNomeCliente(nomeCliente);
		Cliente.setCPFCNPJ(CPFCNPJ);
		Cliente.setTelCelular(telCelular);
		Cliente.setTelFixo(telFixo);
		Cliente.setTelRecado(telRecado);
		Cliente.setEmail(email);
		Cliente.setEnderecoCliente(enderecoCliente);
		Cliente.setNumeroCliente(numeroCliente);
		Cliente.setComplementoCliente(complementoCliente);
		Cliente.setBairroCliente(bairroCliente);
		Cliente.setCidadeCliente(cidadeCliente);
		Cliente.setEstadoCliente(estadoCliente);
		Cliente.setCepCliente(cepCliente);
		
		ClienteService.criar(Cliente);
		request.setAttribute("Cliente", Cliente);
		RequestDispatcher rd = request.getRequestDispatcher("ExibeCliente.jsp");
		rd.forward(request, response);
	}

}
