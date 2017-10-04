package entregas;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/editar_entrega"})
public class EditarEntregaController  extends HttpServlet {
	
	public EditarEntregaController(){
		super();
	}

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idEntrega = Integer.parseInt(request.getParameter("idEntrega"));
		
		EntregasService entregasService = new EntregasService();
		Entrega entrega = entregasService.findById(idEntrega);
		
		request.setAttribute("entrega", entrega);
		request.getRequestDispatcher("editar_entrega.jsp").forward(request, response);
	}
}

