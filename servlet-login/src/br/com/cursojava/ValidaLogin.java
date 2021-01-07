package br.com.cursojava;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidaLogin
 */
@WebServlet(description = "Criando um formulário web de cadastro de usuários", urlPatterns = { "/valida-login" })
public class ValidaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if (Objects.nonNull(senha) && senha.equals("impacta123")) {
			RequestDispatcher rd = request.getRequestDispatcher("/sistema");
			rd.forward(request, response);
		} else {
			response.sendRedirect("http://localhost:8080/servlet-login/erroLogin.html");
		}
	}

}
