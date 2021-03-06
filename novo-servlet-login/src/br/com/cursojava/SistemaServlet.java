package br.com.cursojava;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sistema")
public class SistemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario user = (Usuario) request.getSession().getAttribute("usuario");

		Cookie[] cookies = request.getCookies();
		String email = null;

		if (Objects.nonNull(cookies)) {
			email = Arrays.stream(cookies).filter(c -> c.getName().equals("email")).map(c -> new String(c.getValue()))
					.findFirst().orElse(null);
		}

		if (Objects.isNull(email) || email.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/coletaEmail");
			rd.forward(request, response);
		}

		StringBuilder html = new StringBuilder();

		html.append("<!DOCTYPE html><html><head>");
		html.append("<meta charset=\"ISO-8859-1\">");
		html.append("<title>Bem Vindo</title>");
		html.append("</head><body>");
		html.append("<h1>Bem Vindo ");
		html.append(user.getLogin());
		html.append(" !</h1>");
		html.append("<h3>Esta � a p�gina principal do sistema</h3>");
		html.append("<p>Seu email �: ");
		html.append(email);
		html.append("</p>");
		html.append("<p>");
		html.append("<a href=\"/novo-servlet-login/login.html\">Logout</a>");
		html.append("</p>");
		html.append("</body></html>");
		response.getWriter().append(html);
	}

}
