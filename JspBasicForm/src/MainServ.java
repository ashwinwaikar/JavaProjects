
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*1) index.jsp

	accept user name and password

	on submit control should go to "MainServ"

	"MainServ" will check if user name and password is "scott" and "tiger" respectively , it will forward to "Welcome.jsp" which will display welcome message.
if user name and password is not correct, "MainServ" will forward to "index.jsp".
*/
/**
 * Servlet implementation class MainServ
 */
@WebServlet("/MainServ")
public class MainServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(username.equalsIgnoreCase("scott")& password.equals("tiger")) {
			RequestDispatcher rd=request.getRequestDispatcher("/Welcome.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}
		}
	

}
