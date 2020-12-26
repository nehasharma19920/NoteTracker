package com.servlets;

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

public class SaveNotesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveNotesServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String tittle = request.getParameter("tittle");
			String content = request.getParameter("content");
			Note note = new Note(tittle, content, new Date());
			System.out.println(note);

			Session session = FactoryProvider.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(note);
			tx.commit();
			session.close();
			
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<h1 style = 'text-align:center;'>Note added successfully</h1>");
			writer.println("<h1 style = 'text-align:center;'><a href='view_all_notes.jsp'>View all notes</a></h1>");
			writer.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
