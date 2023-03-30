package fr.univtours.polytech.library.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.univtours.polytech.library.business.factory.local.BookBusinessLocal;
import fr.univtours.polytech.library.model.BookBean;

/**
 * Servlet implementation class NotesServlet
 */
@WebServlet(name = "books", urlPatterns = { "/books" })
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private BookBusinessLocal businessBook;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<BookBean> books = this.businessBook.getAll();

		request.setAttribute("BOOKS", books);

		RequestDispatcher dispatcher = request.getRequestDispatcher("Books.jsp");
		dispatcher.forward(request, response);
	}
}
