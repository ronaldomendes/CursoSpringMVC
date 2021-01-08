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
@WebServlet(description = "Criando um formul�rio web de cadastro de usu�rios", urlPatterns = { "/valida-login" })
public class ValidaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = Objects.nonNull(request.getParameter("nome")) ? request.getParameter("nome") : "";
		String login = Objects.nonNull(request.getParameter("login")) ? request.getParameter("login") : "muito esperto n�";
		String email = Objects.nonNull(request.getParameter("email")) ? request.getParameter("email") : "";
		String senha = request.getParameter("senha");

		if (Objects.nonNull(senha) && senha.equals("impacta123")) {
			Usuario user = new Usuario(nome, login, senha, email);

			request.getSession().setAttribute("usuario", user);
			RequestDispatcher rd = request.getRequestDispatcher("/sistema");
			rd.forward(request, response);
		} else {
			response.sendRedirect("http://localhost:8080/servlet-login/erroLogin.html");
		}
	}

}
