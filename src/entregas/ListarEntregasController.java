package entregas;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/entregas"})
public class ListarEntregasController extends HttpServlet {
	
	public ListarEntregasController(){
		super();
	}

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntregasService entregasService = new EntregasService();
		List<Entrega> entregas = entregasService.listarTodasEntregas();
	
		request.setAttribute("entregas", entregas);
		request.getRequestDispatcher("entregas.jsp").forward(request, response);
	}
}

