
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/userdb1";
			con = DriverManager.getConnection(url, "root", "root");
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();

			String name = request.getParameter("name");
			String password = request.getParameter("password");

			PreparedStatement pst = con
					.prepareStatement("select name,password from register where name=? and password=?");
			pst.setString(1, name);
			pst.setString(2, password);

			ResultSet rs = pst.executeQuery();

			ServletContext context = this.getServletContext();
			ServletContext context1 = context.getContext("/LoginRegistrationAssignment");

			while (rs.next()) {
				String name1 = rs.getString("name");
				String password1 = rs.getString("password");

				pw.println(name1);
				pw.println(password1);
				if (name.equalsIgnoreCase(name1) & password.equals(password1)) {
					RequestDispatcher rd = context1.getRequestDispatcher("/Success.jsp");
					rd.forward(request, response);
				}
			}
			if (!rs.next()) {
				RequestDispatcher rd = context1.getRequestDispatcher("/Fail.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
