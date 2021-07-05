package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Response;

import sun.security.jca.GetInstance.Instance;

@WebServlet("/notice-reg")
public class NoticeReg extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/text; charset=UTF-8");
//		req.setCharacterEncoding("UTF-8");
		
		
		PrintWriter out = res.getWriter();
		
//		for(int i=0; i<100;i++)
//			out.println((i+1)+": ¾È³ç Hello World<br>");
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		out.println(title);
		out.println(content);
		
	}

	private boolean isStringInteger(String cnt_) {
		// TODO Auto-generated method stub
		return false;
	}
}
