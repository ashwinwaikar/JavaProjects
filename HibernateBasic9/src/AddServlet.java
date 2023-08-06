
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack1.Student;
import mypack1.StudentBO;
import mypack1.StudentDAO;
import mypack1.StudentDAODataImpl;
import mypack1.StudentDAOFileImpl;

/*AddServlet will have a reference to 

	StudentDAO sdao;
the idea here is that "sdao" can point to any implementation of "StudentDAO" and invoke "addStudent()" polymorphically.

inside doPost() method 
a) instantiate "Student" with the values provided by user.
b) u will check the persistence store selected by user.
if this is "file"
	set the rollno.
	servlet will instantiate "StudentDAOFileImpl" and invoke "addStudent()" method.

if this is "data"
	servlet will instantiate "StudentDAODataImpl" and invoke "addStudent()" method.
*/
/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentDAO sdao;
		Student s = new Student();
		s.setAddress(request.getParameter("address"));
		s.setName(request.getParameter("name"));

		String choice = request.getParameter("dropdown");
		if (choice.equalsIgnoreCase("filesystem")) {
			s.setRollno(10);
			StudentDAOFileImpl stufile = new StudentDAOFileImpl();

			// StudentBO stubo = new StudentBO(stufile);
			// stubo.add(s);
			// System.out.println(stubo.get());

			sdao = stufile;
			sdao.addStudent(s);
			System.out.println("Done with Student");
		} else {
			StudentDAODataImpl studatabase = new StudentDAODataImpl();

			// StudentBO stubo = new StudentBO(studatabase);
			// stubo.add(s);
			// System.out.println(stubo.get());

			sdao = studatabase;
			sdao.addStudent(s);
			System.out.println("Done with Student");
		}
	}

}
