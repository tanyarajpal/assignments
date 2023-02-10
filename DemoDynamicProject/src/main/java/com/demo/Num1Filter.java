package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
/**
 * Servlet Filter implementation class Num1Filter
 */
@WebFilter("/add")
public class Num1Filter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public Num1Filter() {
        super();
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
        //System.out.println("Inside Filter");
        PrintWriter out = response.getWriter();
        
        HttpServletRequest req = (HttpServletRequest) request;
        int num1 = Integer.parseInt(request.getParameter("num1"));
        if(num1>1)
            chain.doFilter(request, response);
        else
        {
            out.println("Invalid input");
        }
        // pass the request along the filter chain
        //chain.doFilter(request, response);
    }
    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
    }
}