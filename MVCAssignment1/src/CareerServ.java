
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack1.*;

/**
 * Servlet implementation class CareerServ
 */
@WebServlet("/CareerServ")
public class CareerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String qualification = request.getParameter("qualification");

		CareerExpert c = new CareerExpert();
		c.setAdvice(qualification);

		request.setAttribute("advice", c);
		RequestDispatcher rd = request.getRequestDispatcher("/CareerDetails.jsp");
		rd.forward(request, response);

	}

}
