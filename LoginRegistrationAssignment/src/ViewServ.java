
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
 * Servlet implementation class ViewServ
 */
@WebServlet("/ViewServ")
public class ViewServ extends HttpServlet {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from register");
			PrintWriter pw = response.getWriter();
			while (rs.next()) {
				String name1 = rs.getString("name");
				String address1 = rs.getString("address");
				String email1 = rs.getString("email");
				String password1 = rs.getString("password");

				pw.println(name1);
				pw.println(address1);
				pw.println(email1);
				pw.println(password1);
				pw.println("<br>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
