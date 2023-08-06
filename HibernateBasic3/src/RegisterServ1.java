
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.digester.SystemPropertySource;
import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack1.Register;

/**
 * Servlet implementation class RegisterServ
 */
@WebServlet(name = "RegisterServ1", urlPatterns = { "/RegisterServ1" })
public class RegisterServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String emailid = request.getParameter("emailid");
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		// System.out.println(name + address + emailid + login + password);

		Register r1 = new Register();
		r1.setId(id);
		r1.setName(name);
		r1.setAddress(address);
		r1.setEmailid(emailid);
		r1.setLogin(login);
		r1.setPassword(password);

		Session session = mypack1.HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			session.save(r1);

			transaction.commit();
			PrintWriter pw = response.getWriter();
			pw.write("Data Got Saved Successfully");

			System.out.println(r1);
			System.out.println("done");
		} catch (Exception ee) {
			System.out.println("in catch\t" + ee);
		}
	}

}
