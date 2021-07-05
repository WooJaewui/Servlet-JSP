package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/peep")
public class Test1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charSet=UTF-8");
		
		String id_ = request.getParameter("id");
		String peep_ = request.getParameter("peep");

		String deep_ = request.getParameter("deep");
		
		if(!id_.equals(" "))
			response.getWriter().println(id_);
		if(!peep_.equals(" "))
			response.getWriter().println(peep_);
		
		if(!deep_.equals(" "))
			response.getWriter().println(deep_);
		
		
		
	}

}
