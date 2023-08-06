package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginDemoo", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("psw");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");

		try {
			PreparedStatement stmt = conn.prepareStatement("insert into Register values(?,?,?,?)");

			stmt.setString(1, name);
			stmt.setString(2, password);
			stmt.setString(3, email);
			stmt.setString(4, mobile);

			int i = stmt.executeUpdate();
			if (i > 0) {
//				 pw.println("Record Inserted Succesfully");
//				response.sendRedirect("index.html");
//				 pw.println("Record Inserted Succesfully");

				RequestDispatcher rd = request.getRequestDispatcher("index.html");
				rd.forward(request, response);
//				rd.include(request, response);
			} else
				pw.println("Something Went Wrong");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

}
