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
import fr.univtours.polytech.library.business.factory.local.BookTypeBusinessLocal;
import fr.univtours.polytech.library.model.BookBean;
import fr.univtours.polytech.library.model.BookTypeBean;

/**
 * Servlet implementation class NotesServlet
 */
@WebServlet(name = "books", urlPatterns = { "/books" })
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private BookBusinessLocal businessBook;
	
	@EJB
	private BookTypeBusinessLocal businessBookType;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<BookBean> books;
		List<BookTypeBean> bookTypes = this.businessBookType.getAll();
		
		String searchString = "";
		int bookTypeID = -1;
		boolean available = false;
		
		if (request.getParameter("search") != null) {
			searchString = request.getParameter("search");
			request.setAttribute("FILTER_SEARCH", searchString);
		}
		
		if (request.getParameter("type") != null) {
			bookTypeID = Integer.valueOf(request.getParameter("type"));
			request.setAttribute("FILTER_TYPE", bookTypeID);
		}
		
		if (request.getParameter("availability") != null) {
			available = request.getParameter("availability").compareTo("on") == 0 ? true : false;
			request.setAttribute("FILTER_AVAILABILITY", available);
		} 
		
		if (searchString.compareTo("") == 0 && bookTypeID == -1 && !available) {
			books = this.businessBook.getAll();
		} else {
			books = this.businessBook.getFilteredBooks(searchString, bookTypeID, available);
		}

		request.setAttribute("BOOKS", books);
		request.setAttribute("BOOK_TYPES", bookTypes);

		RequestDispatcher dispatcher = request.getRequestDispatcher("Books.jsp");
		dispatcher.forward(request, response);
	}
}
