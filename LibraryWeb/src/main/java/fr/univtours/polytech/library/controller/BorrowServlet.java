package fr.univtours.polytech.library.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.univtours.polytech.library.business.factory.local.BookBusinessLocal;
import fr.univtours.polytech.library.business.factory.local.BorrowBusinessLocal;
import fr.univtours.polytech.library.model.BookBean;
import fr.univtours.polytech.library.model.BorrowBean;
import fr.univtours.polytech.library.model.UserBean;

/**
 * Servlet implementation to borrow a book.
 */
@WebServlet(name = "borrow", urlPatterns = { "/borrow" })
public class BorrowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private BookBusinessLocal businessBook;

	@EJB
	private BorrowBusinessLocal businessBorrow;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		if (session.getAttribute("UserConected") != null) {
			UserBean user = (UserBean) session.getAttribute("UserConected");
			int bookID = Integer.valueOf(request.getParameter("bookID"));

			if (businessBook.isBookAvailable(bookID)) {
				ArrayList<BorrowBean> borrows = businessBorrow.getBorrowsNotRetunedOfuser(user.getId());

				if (borrows != null && borrows.size() < 5) {
					BorrowBean borrow = new BorrowBean();
					borrow.setUser(user);

					BookBean book = businessBook.get(bookID);
					borrow.setBook(book);
					borrow.setDate(LocalDateTime.now());
					businessBorrow.insert(borrow);

					book.setAvailable(false);
					businessBook.update(book);
				}
			}
		}

		response.sendRedirect("books");
	}
}
