package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NextServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//		PrintWriter p = response.getWriter();
//		p.println(name + " " + password);

//		
//		Cookie cookie[] = request.getCookies();
//		PrintWriter p = response.getWriter();
//		for (int i = 0; i < cookie.length; i++) {
//			p.println(cookie[i].getName() + " " + cookie[i].getValue());
//		}

		HttpSession httpsession = request.getSession(false);// This will return old session object when we put false as
															// a parameter
		System.out.println(httpsession);
		String name = (String) httpsession.getAttribute("Name");
		String password = (String) httpsession.getAttribute("Pass");
		PrintWriter p = response.getWriter();
		p.println(name + " " + password);
	}

}
