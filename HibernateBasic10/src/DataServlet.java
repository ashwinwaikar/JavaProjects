
import java.io.IOException;
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
import mypack1.Dept;

/**
 * Servlet implementation class DataServlet
 */
@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query<Object> query = session.createQuery("from Dept where location=:str");

			String location = request.getParameter("location").trim();

			query.setParameter("str", location);
			List<Object> mylist = (List<Object>) query.list();

			transaction.commit();

			request.setAttribute("mylist1", mylist);
			RequestDispatcher rd = request.getRequestDispatcher("/Data.jsp");
			rd.forward(request, response);

			System.out.println("Done with Person");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
