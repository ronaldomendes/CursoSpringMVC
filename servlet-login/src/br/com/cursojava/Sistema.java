package br.com.cursojava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sistema
 */
@WebServlet("/sistema")
public class Sistema extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("login");

		StringBuilder html = new StringBuilder();
		
		html.append("<!DOCTYPE html><html><head>"); 
		html.append("<meta charset=\"ISO-8859-1\">"); 
		html.append("<title>Bem Vindo</title>"); 
		html.append("</head><body>");
		html.append("<h1>Bem Vindo ");
		html.append(login);
		html.append(" !</h1>");
		html.append("<h3>Esta é a página principal do sistema</h3>");
		html.append("<p>");
		html.append("<a href=\"/servlet-login/login.html\">Logout</a>");
		html.append("</p>");
		html.append("</body></html>");
		response.getWriter().append(html);
	}
}
