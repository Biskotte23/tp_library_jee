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

import fr.univtours.polytech.library.business.factory.local.AuthorBusinessLocal;
import fr.univtours.polytech.library.business.factory.local.BookBusinessLocal;
import fr.univtours.polytech.library.business.factory.local.BookTypeBusinessLocal;
import fr.univtours.polytech.library.business.factory.local.BorrowBusinessLocal;
import fr.univtours.polytech.library.business.factory.local.BusinessLocalFactory;
import fr.univtours.polytech.library.business.factory.local.UserBusinessLocal;
import fr.univtours.polytech.library.model.AuthorBean;
import fr.univtours.polytech.library.model.BookBean;
import fr.univtours.polytech.library.model.BookTypeBean;
import fr.univtours.polytech.library.model.BorrowBean;
import fr.univtours.polytech.library.model.UserBean;

/**
 * Servlet implementation class NotesServlet
 */
@WebServlet(name = "books", urlPatterns = { "/books" })
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	//private BookTypeBusinessLocal businessTypeBook;
	private BookBusinessLocal businessBook;
	//private UserBusinessLocal businessUser;
	//private AuthorBusinessLocal businessAuthor;
	//private BorrowBusinessLocal businessBorrow;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//List<BookTypeBean> bookTypes = this.businessTypeBook.getAll();
		List<BookBean> book = this.businessBook.getAll();
		//List<UserBean> user = this.businessUser.getAll();
		//List<AuthorBean> author = this.businessAuthor.getAll();
		//List<BorrowBean> borrow = this.businessBorrow.getAll();

		//request.setAttribute("BOOK_TYPES", bookTypes);

		RequestDispatcher dispatcher = request.getRequestDispatcher("Books.jsp");
		dispatcher.forward(request, response);
	}
}
