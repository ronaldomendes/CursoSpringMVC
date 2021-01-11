package br.com.cursojava;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class HelloFiltro
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, description = "Criando um filtro", urlPatterns = { "/HelloFiltro" })
public class HelloFiltro implements Filter {

    /**
     * Default constructor. 
     */
    public HelloFiltro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest http = (HttpServletRequest) request;

		System.out.println("Filtro acessado!");
		http.getSession();
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("Retornando a requisição");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
