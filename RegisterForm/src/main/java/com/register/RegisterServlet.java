package com.register;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegisterServlet extends HttpServlet{
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			 PrintWriter out = res.getWriter();
//				out.println("hello");
			 if((req.getParameter("reset") != null)){
//				 PrintWriter out = res.getWriter();
					out.println("hello");
		    }
			else if((req.getParameter("register") != null)){
				boolean myCheckBox = req.getParameter( "agreement" ) != null;
				if(myCheckBox) {
					String name = req.getParameter("full name");
					String password = req.getParameter("password");
					String email = req.getParameter("email");
//					PrintWriter out = res.getWriter();
					out.println("Registration Details : "+ name + " " + email + " " + password);
					
				}
				else {
//					PrintWriter out = res.getWriter();
					out.println("please accept the terms and conditions");
				}
			}
		}
	}

