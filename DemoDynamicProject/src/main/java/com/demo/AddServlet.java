package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j =  Integer.parseInt(req.getParameter("num2"));
		int result = i + j;
//		System.out.println("Result is : " + result);
//		PrintWriter out = res.getWriter();
//		out.println("Result is : "+ result);
//		req.setAttribute("result", result);
//		RequestDispatcher red = req.getRequestDispatcher("sq");
//		red.forward(req, res);
//		HttpSession session = req.getSession();
//		session.setAttribute("result", result);
		Cookie cookie = new Cookie("result",result+"");
		res.addCookie(cookie);
//		res.sendRedirect("sq?result="+result);// url rewriting
		res.sendRedirect("sq");
	}
}
