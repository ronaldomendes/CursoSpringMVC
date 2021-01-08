package br.com.cursojava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdicaoDeCookie
 */
@WebServlet(description = "Cookies", urlPatterns = { "/addCookie" })
public class AdicaoDeCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie01 = new Cookie("cookie-java-web", "HelloCookie");
		response.addCookie(cookie01);
		Cookie cookie02 = new Cookie("cookie-cocozinho", "HelloCocozinho");
		response.addCookie(cookie02);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
