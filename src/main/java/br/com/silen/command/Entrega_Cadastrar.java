//package br.com.silen.command;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import model.Cliente;
//import model.Entrega;
//import service.ClienteService;
//import service.EntregasService;
//
//public class Entrega_Cadastrar implements Command {
//	
//	@Override
//	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		Cliente remetente = new Cliente();
//		Cliente destinatario = new Cliente();
//		Entrega entrega = new Entrega();
//		ClienteService clienteServiceRemetente = new ClienteService();		
//		ClienteService clienteServiceDestinatario = new ClienteService();
//		
//		//Insere informa��es do cliente pesquisado como destinatario
//		int idRemetente = Integer.parseInt(request.getParameter("idRemetente"));
//		int nrDocumentRemetente = Integer.parseInt(request.getParameter("nrDocumentRemetente"));
//		String nomeRemetente = request.getParameter("nomeRemetente");
//		remetente = clienteServiceRemetente.buscarCliente(idRemetente,nrDocumentRemetente, nomeRemetente);
//		
//		//Insere informa��es do cliente pesquisado como destinatario
//		int idDestinatario = Integer.parseInt(request.getParameter("idDestinatario"));
//		int nrDocumentDestinatario = Integer.parseInt(request.getParameter("nrDocumentDestinatario"));
//		String nomeDestinatario = request.getParameter("nomeDestinatario");
//		destinatario = clienteServiceDestinatario.buscarCliente(idDestinatario,nrDocumentDestinatario, nomeDestinatario);
//			
//		//Dados Gerais da Entrega
//		
//		
//		//entrega.setIdEntregas(Integer.parseInt(request.getParameter("IdEntrega")));
//		entrega.setQuantidade(Integer.parseInt(request.getParameter("Quantidade")));
//		entrega.setPeso(Integer.parseInt(request.getParameter("Peso")));
//		entrega.setDataEnvio(request.getParameter("dtEnvio"));
//		entrega.setDataRetirada(request.getParameter("dtEntrega"));
//		entrega.setContato(request.getParameter("txtContato"));
//		entrega.setTelefone(request.getParameter("txtTelefone"));
//		entrega.setIdStatus(Integer.parseInt(request.getParameter("statusEntrega")));
//		
//		EntregasService EntregasService = new EntregasService();
//		request.setAttribute("entrega", entrega);
//		RequestDispatcher rd = request.getRequestDispatcher("ExibeEntregas.jsp");
//		rd.forward(request, response);
//	}
//
//}
