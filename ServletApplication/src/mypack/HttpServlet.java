package mypack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		response.getWriter().append("ORIGINAL SERVICE METHOD" + " " + name + " " + password);

	}

//	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("HTTP SERVICE METHOD").append(request.getContextPath());
//
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("doGet ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("doPost ").append(request.getContextPath());
	}

}
