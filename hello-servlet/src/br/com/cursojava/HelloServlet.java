package br.com.cursojava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(description = "Primeiro exemplo de servlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<html><title>Primeiro Servlet</title>"
				+ "<body><h1>Hello Servlet</h1>"
				+ "<ul style=\"font-size:20px;\">"
				+ "<li>Um exemplo de servlet rodando no Eclipse</li>"
				+ "<li>O Eclipse é muito pesado</li>"
				+ "</ul>"
				+ "</body><html>");
	}
}
