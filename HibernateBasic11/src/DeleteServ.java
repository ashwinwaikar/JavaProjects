
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

/**
 * Servlet implementation class DeleteServ
 */
@WebServlet("/DeleteServ")
public class DeleteServ extends HttpServlet {
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
			Query<Object> query = session.createQuery("delete from Course where CID=:id");

			int id1 = Integer.parseInt(request.getParameter("id"));

			query.setParameter("id", id1);

			int res = query.executeUpdate();  
			
			transaction.commit();

			RequestDispatcher rd = request.getRequestDispatcher("/Delete.jsp");
			rd.forward(request, response);

			System.out.println("Done with Person");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
