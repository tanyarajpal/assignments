package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SqrServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int r = (int) req.getAttribute("result");
//		HttpSession session = req.getSession();
//		int r = Integer.parseInt(req.getParameter("result"));
		int r = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("result"))
				r = Integer.parseInt(c.getValue());
		}
		r = r*r;
		PrintWriter out = res.getWriter();
		out.println("From Square Servlet : " + r);
	}
}
