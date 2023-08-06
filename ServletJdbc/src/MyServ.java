
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
 * Servlet implementation class MyServ
 */
@WebServlet("/MyServ")
public class MyServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try
	    {
	      Class.forName ("com.mysql.jdbc.Driver");
	      String url = "jdbc:mysql://localhost:3306/userdb1";
	        con = DriverManager.getConnection (url, "root", "root");
	    }
	    catch (Exception ee)
	    {
	      ee.printStackTrace ();
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try
	    {
	      response.setContentType ("text/html");
	      PrintWriter pw = response.getWriter ();
	      int rollno = Integer.parseInt (request.getParameter ("rollno").trim ());
	      String name = request.getParameter ("name");
	      int age = Integer.parseInt (request.getParameter ("age").trim ());
	      String qualification = request.getParameter ("qualification");

	      PreparedStatement pst =
		con.prepareStatement ("insert into student values(?,?,?,?)");
	      pst.setInt (1, rollno);
	      pst.setString (2, name);
	      pst.setInt (3, age);
	      pst.setString (4, qualification);
	      int k = pst.executeUpdate ();
	      if (k > 0)
		{
		  pw.println ("Record has been added");
		}
	      else
		{
		  pw.println ("cannot add");
		}
	    }
	    catch (Exception ee)
	    {
	      ee.printStackTrace ();
	    }
	}

}
