package br.com.silen.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.model.Cliente;
import br.com.silen.service.ClienteService;

public class Cliente_Atualizar implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService clienteService = new ClienteService();
		
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		String nomeCliente = request.getParameter("nomeCliente");
		String CPFCNPJ = request.getParameter("CPFCNPJ");
//		int tipoPessoa = Integer.parseInt(request.getParameter("tipoPessoa")) ;
		String telCelular = request.getParameter("telCelular");
		String telFixo = request.getParameter("telFixo");
		String telRecado  = request.getParameter("telRecado");
		String email = request.getParameter("email");
		String enderecoCliente = request.getParameter("enderecoCliente");
		String numeroCliente = request.getParameter("numeroCliente");
		String complementoCliente  = request.getParameter("nomeCliente");
		String bairroCliente = request.getParameter("bairroCliente");
		String cidadeCliente = request.getParameter("cidadeCliente");
		String estadoCliente = request.getParameter("estadoCliente");
		String cepCliente = request.getParameter("cepCliente");
		int idTipoContrato = Integer.parseInt(request.getParameter("idTipoContrato"));

		Cliente cliente = new Cliente();
		cliente.setIdCliente(idCliente);
		cliente.setNomeCliente(nomeCliente);
		cliente.setCPFCNPJ(CPFCNPJ);
//		cliente.setTipoPessoa(tipoPessoa);
		cliente.setTelCelular(telCelular);
		cliente.setTelFixo(telFixo);
		cliente.setTelRecado(telRecado);
		cliente.setEmail(email);
		cliente.setEnderecoCliente(enderecoCliente);
		cliente.setNumeroCliente(numeroCliente);
		cliente.setComplementoCliente(complementoCliente);
		cliente.setBairroCliente(bairroCliente);
		cliente.setCidadeCliente(cidadeCliente);
		cliente.setEstadoCliente(estadoCliente);
		cliente.setCepCliente(cepCliente);
		cliente.setIdTipoContrato(idTipoContrato);
				
		clienteService.atualizar(cliente);
		request.setAttribute("cliente", cliente);
		RequestDispatcher rd = request.getRequestDispatcher("AtualizarCliente.jsp");
		rd.forward(request, response);
	}

}
