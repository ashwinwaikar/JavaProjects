
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack1.HibernateUtil;
import mypack1.Course;
import mypack1.Module;

/**
 * Servlet implementation class CourseServ
 */
@WebServlet("/CourseServ")
public class CourseServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {

			String course = request.getParameter("course");
			String module1 = request.getParameter("module1");
			String module2 = request.getParameter("module2");
			String module3 = request.getParameter("module3");

			transaction = session.beginTransaction();
			Course c1 = new Course();

			Module m1 = new Module();
			m1.setName(module1);

			Module m2 = new Module();
			m2.setName(module2);

			Module m3 = new Module();
			m3.setName(module3);

			Set<Module> h = new HashSet<>();
			h.add(m1);
			h.add(m2);
			h.add(m3);

			c1.setName(course);
			c1.setModules(h);

			session.save(c1);

			transaction.commit();

			System.out.println("done with Course");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
