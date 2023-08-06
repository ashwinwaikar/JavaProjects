package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

/**
 * Servlet implementation class SaveNoteServlet
 */
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveNoteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// title,content fetch
			String parameter1 = request.getParameter("title");
			String parameter2 = request.getParameter("content");

			Note note = new Note(parameter1, parameter2, new Date());

			// System.out.println(note);

			// using hibernate
			Session session = FactoryProvider.getFactory().openSession();

			Transaction tx = session.beginTransaction();

			session.save(note);

			tx.commit();

			session.close();

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1 style='text-align:center'>Note is Added Re</h1>");
			out.println("<h1 style='text-align:center'><a href='all_notes.jsp'>View all notes</a></h1>");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
