package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class UploadingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body bgcolor=yellow>");

//		String name = request.getParameter("name");
//		out.println("WELCOME" + name);//IT WILL GIVE NULL VALUE IN RETURN BECAUSE OF THE enctype="multipart/form-data"

//		String path = this.getServletConfig().getServletContext().getRealPath("dataupload");// TO GET THE REAL PATH OF
		// FOLDER WHERE WE HAVE TO
		// UPLOAD
		String path = "C:\\Users\\ASW\\eclipse-workspace\\Uploading\\WebContent\\dataupload";

		MultipartRequest mpr = new MultipartRequest(request, path, 20 * 1024 * 1024);// THIS IS USED FOR UPLOADING

		String st = mpr.getOriginalFileName("filename");
		out.println(st);// PRINTS FILE NAME

		String id = mpr.getParameter("name");

		out.println("Welcome " + id);
		out.println(st + " File Uploaded.....");
		out.println("</body></html>");

		out.close();
	}

}
