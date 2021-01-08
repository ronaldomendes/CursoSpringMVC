package br.com.cursojava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EscopoSession
 */
@WebServlet(description = "Escopo de sessão", urlPatterns = { "/session" })
public class EscopoSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getSession().setAttribute("contador", 1);
		int contador = (Integer) request.getSession().getAttribute("contador");
		System.out.println("Contador no escopo de sessão: " + contador);
		
		StringBuilder html = new StringBuilder();
		
		html.append("<!DOCTYPE html><html><head>"); 
		html.append("<meta charset=\"ISO-8859-1\">"); 
		html.append("<title>Escopo Session</title>"); 
		html.append("</head><body>");
		html.append("<h1>Contador no escopo de sessão: ");
		html.append(contador);
		html.append(" !</h1>");
		html.append("</body></html>");
		response.getWriter().append(html);
	}

}
