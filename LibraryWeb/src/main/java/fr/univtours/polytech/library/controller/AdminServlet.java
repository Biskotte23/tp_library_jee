package fr.univtours.polytech.library.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
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

@WebServlet(name = "admin", urlPatterns = { "/admin" })
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private BorrowBusinessLocal businessBorrow;
	@EJB
	private BookBusinessLocal businessBook;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		UserBean userConnected = (UserBean) session.getAttribute("UserConected");
		/*
		 * if (userConnected == null || userConnected.getStatus() != UserStatus.admin) {
		 * RequestDispatcher dispatcher = request.getRequestDispatcher("Books.jsp");
		 * dispatcher.forward(request, response); }
		 */
		List<BorrowBean> booksBorrowed = businessBorrow.getAllNotReturnedBorrow();
		request.setAttribute("BORROWS", booksBorrowed);

		RequestDispatcher dispatcher = request.getRequestDispatcher("Admin.jsp");
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer idBorrow = Integer.parseInt(request.getParameter("id"));
		BorrowBean borrow = businessBorrow.get(idBorrow);
		borrow.setRenderingDate(LocalDateTime.now());
		businessBorrow.update(borrow);

		BookBean book = borrow.getBook();
		book.setAvailable(true);
		businessBook.update(book);

		doGet(request, response);
	}
}
