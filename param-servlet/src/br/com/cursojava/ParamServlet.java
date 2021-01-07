package br.com.cursojava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet(description = "Demonstração de passagem de parâmetros via get", urlPatterns = { "/param" })
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		
		Integer id = (idade != null) ? Integer.parseInt(idade) : 0;
		
		System.out.printf("Nome: %s - Idade: %d. \n", nome, id);
		response.getWriter().append("<html><body><h1>Resultados</h1>"
				+ "<p>Nome: "+ nome +" </p>"
				+ "<p>Idade: "+ id +" anos</p>"
				+ "</body></html>");
		
		// Consulta em --> http://localhost:8080/param-servlet/param?nome=Ronaldo&idade=33
	}

}
