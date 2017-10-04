package controllers;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.User;

@WebServlet(urlPatterns = {"/inicio"})
public class MainController extends HttpServlet {
	public MainController(){
		super();
	}

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User(1l, "Ramon", "ramon.andrade@elo7.com");
	
		request.setAttribute("user", user);
		request.getRequestDispatcher("page.jsp").forward(request, response);
	}
}
