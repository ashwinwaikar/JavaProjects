package com.mytest.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletfirstprogram", "root", "root");
			// here servletfirstprogram is database name, root is username and password
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("DO GET ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("DO POST ").append(request.getContextPath());

		String str = "";
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] str_vehicle = request.getParameterValues("vehicle");

		for (String st : str_vehicle) {
			str = str + " " + st;

//			response.getWriter().append(name + " " + password + " " + gender + " " + str + " " + con);
//			OR
			PrintWriter writer = response.getWriter();
			writer.println(name + " " + password + " " + gender + " " + str + " " + con);
		}
		try {
			PreparedStatement stmt = con.prepareStatement("insert into firstprogram values(?,?,?,?)");

			stmt.setString(1, name);
			stmt.setString(2, password);
			stmt.setString(3, gender);
			stmt.setString(4, str);

			int i = stmt.executeUpdate();
			if (i > 0)
				System.out.println("Record Inserted Succesfully");
			else
				System.out.println("Something Went Wrong");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}