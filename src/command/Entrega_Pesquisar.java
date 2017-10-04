//package command;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import model.Entrega;
//import service.EntregasService;
//
//public class Entrega_Pesquisar implements Command{
//	
//	@Override
//	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		EntregasService service = new EntregasService();
//		
//		//response.setStatus(200);
//		//response.getOutputStream(teste);
//		request.setAttribute("entregas", entregas);
//		request.getRequestDispatcher("adm_entregas.jsp").forward(request, response);
//	}
//
//}
