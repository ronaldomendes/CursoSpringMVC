package br.com.cursojava;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CicloVidaServlet
 */
@WebServlet(description = "Ilustra o ciclo de vida de uma Servlet", urlPatterns = { "/ciclo-vida" })
public class CicloVidaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int contador = 1;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Iniciando o ciclo de vida de uma Servlet");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destruindo o ciclo de vida de uma Servlet");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Nova requisição do cliente: " + contador++);
	}

}
