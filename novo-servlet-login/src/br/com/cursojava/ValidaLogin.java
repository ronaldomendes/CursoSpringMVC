package br.com.cursojava;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/valida-login")
public class ValidaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Usuario user = (Usuario) request.getSession().getAttribute("usuario");

		if (Objects.isNull(user)) {
			user = new Usuario();
			user.setLogin(login);
			user.setSenha(senha);

			request.getSession().setAttribute("usuario", user);
		}

		if (Objects.nonNull(senha) && senha.equals("impacta123")) {
			RequestDispatcher rd = request.getRequestDispatcher("/sistema");
			rd.forward(request, response);
		} else {
			response.sendRedirect("http://localhost:8080/novo-servlet-login/erroLogin.html");
		}
	}
}
