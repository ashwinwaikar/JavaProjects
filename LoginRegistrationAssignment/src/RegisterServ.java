
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/RegisterServ")
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/userdb1";
			con = DriverManager.getConnection(url, "root", "root");
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();

			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			PreparedStatement pst = con.prepareStatement("insert into register values(?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, address);
			pst.setString(3, email);
			pst.setString(4, password);
			int k = pst.executeUpdate();
			if (k > 0) {
				pw.println("<h1>Record has been added</h1>");
				pw.println("<br>");
				pw.println("<a href=\"login.html\">Now Login</a> ");
			} else {
				pw.println("cannot add");
				pw.println("<br>");
				pw.println("<a href=\"Register.html\">Register Again</a> ");
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

}
