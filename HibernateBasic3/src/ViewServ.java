
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack1.HibernateUtil;
import mypack1.Register;

/**
 * Servlet implementation class ViewServ
 */
@WebServlet("/ViewServ")
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {

			Query<?> query = session.createQuery("from Register");
			List<Register> mylist = (List<Register>) query.list();

			System.out.println(mylist);

			request.setAttribute("viewing", mylist);

			RequestDispatcher rd = request.getRequestDispatcher("/ViewRegister.jsp");
			rd.forward(request, response);
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

}
