package test;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.sun.net.httpserver.Filter.Chain;

@WebFilter("/*")
public class Filter implements javax.servlet.Filter {

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
//		response.getWriter().println("Hello world");
		
		
		
	}

}
