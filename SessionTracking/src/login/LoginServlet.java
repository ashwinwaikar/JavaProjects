package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		PrintWriter p = response.getWriter();
		p.println(name + " " + password);

//		p.println("<a href='NextServlet'>NextPage");

		// HIDDEN FORM FIELD---
//		p.println("<html><body><form action='NextServlet' method='post'>");
//		p.println("<input type='hidden' name='name' value='" + name + "'>");
//		p.println("<input type='hidden' name='password' value='" + password + "'>");
//		p.println("<input type='submit'>");
//		p.println("</form></body></html>");

		// URL REWRITING
		// p.println("<a href='NextServlet?name=" + name + "&password=" + password +
		// "'>NextPage");

		// COOKIES----
//		Cookie cookie1 = new Cookie("Name", name);
//		Cookie cookie2 = new Cookie("Pass", password);
//		response.addCookie(cookie1);
//		response.addCookie(cookie2);
//		p.println("<a href='NextServlet'>NextPage");

		// HTTP SESSION---
		p.println("<a href='LogoutServlet'>Logout");
		HttpSession httpSession = request.getSession();
		System.out.println(httpSession);
		if (httpSession.isNew()) {
			httpSession.setAttribute("Name", name);
			httpSession.setAttribute("Pass", password);
			p.println("<a href='NextServlet'>NextPage");
		} else {
			httpSession.invalidate();
			response.sendRedirect("index.html");
		}

	}
}