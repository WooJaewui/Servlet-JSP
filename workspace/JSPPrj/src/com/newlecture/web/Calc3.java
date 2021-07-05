package com.newlecture.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc3")
public class Calc3 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charSet=UTF-8");

		Cookie[] cookies = request.getCookies();

		String v_ = request.getParameter("v");
		String op = request.getParameter("operator");

		int v = 0;

		if (!v_.equals(""))
			v = Integer.parseInt(v_);

		if (op.equals("=")) {
			
			int x = 0;
			for (Cookie c : cookies)
				if (c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			
			int y = v;
			int result = 0;
			String operator = "";
			
			
			for (Cookie c : cookies)
				if (c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			
			if (operator.equals("+"))
				result = x + y;
			else
				result = x - y;
			
			response.getWriter().printf("result is %d\n", result);
			
		}

		else {

			Cookie valueCookie = new Cookie("value", String.valueOf(v));
			Cookie opCookie = new Cookie("op", op);
			valueCookie.setMaxAge(1000);
			valueCookie.setPath("/calc3");
			opCookie.setPath("/calc3");
			response.addCookie(valueCookie);
			response.addCookie(opCookie);
			
			response.sendRedirect("/calc3.html");
		}
		
		
	}

}
