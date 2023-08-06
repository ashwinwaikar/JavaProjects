package com.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/login",name="LoginSevlet")
public class LoginServlet extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	private ServletConfig config;
	
	@Override
		public void init() throws ServletException {
		System.out.println("INIT");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init parameterized");
		this.config=config;
	}
	
	
	@Override
	public void destroy() {
		System.out.println("DESTROY");
		
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}
	
	@Override
	public String getServletInfo() {
		return "this servlet created by Ashwin";
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.containsHeader("text/html");
		System.out.println("test");
		PrintWriter writer=response.getWriter();
		writer.println("<h1>This is the Dummy Servlet</h1>");
	}

}
