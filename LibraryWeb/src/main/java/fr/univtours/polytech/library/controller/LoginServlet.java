package fr.univtours.polytech.library.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.univtours.polytech.library.business.factory.local.UserBusinessLocal;
import fr.univtours.polytech.library.model.UserBean;
import fr.univtours.polytech.library.model.UserStatus;

/**
 * Servlet pour la connexion
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private UserBusinessLocal businessUser;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if (session.getAttribute("UserConected") != null) {
			request.setAttribute("USER", session.getAttribute("UserConected"));
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		UserBean user = businessUser.searchUser(login, password);
		
		if (user != null) {
			session.setAttribute("UserConected", user);
			if(user.getStatus() == UserStatus.basic) {
				response.sendRedirect("books");
			}else {
				response.sendRedirect("admin");
			}

		} else {
			String error = "Identifiant et/ou mot de passe icorrect(s)";
			
			request.setAttribute("ERROR", error);
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}
}
