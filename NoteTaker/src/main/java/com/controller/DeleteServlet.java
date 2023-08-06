package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			//To get a perticular noteId
			int noteId=Integer.parseInt(request.getParameter("note_id").trim());
			
			Session s=FactoryProvider.getFactory().openSession();
			
			Transaction tx=s.beginTransaction();
			
			//To get a perticular note so that we can delete it 
			Note note=s.get(Note.class, noteId);
			
			//Deleting note object
			s.delete(note);
			
			tx.commit();
			
			//redirecting after deletion
			response.sendRedirect("all_notes.jsp");
			
			s.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
