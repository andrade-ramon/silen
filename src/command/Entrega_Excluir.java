//package command;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import model.Entrega;
//import service.EntregasService;
//
//public class Entrega_Excluir implements Command {
//
//	@Override
//	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		EntregasService EntregaService = new EntregasService();
//		int idEntrega = Integer.parseInt(request.getParameter("idEntrega"));
//		
//		Entrega entrega = new Entrega();
//		entrega.setIdEntrega(idEntrega);
//		
//		
//		EntregaService.apagarEntrega(entrega);
//		request.setAttribute("entrega", entrega);
//		RequestDispatcher rd = request.getRequestDispatcher("ApagarEntrega.jsp");
//		rd.forward(request, response);
//	}
//
//}
