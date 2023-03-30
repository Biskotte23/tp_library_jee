package fr.univtours.polytech.library.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.univtours.polytech.library.business.factory.local.UserBusinessLocal;

/**
 * Servlet pour la connexion
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserBusinessLocal businessUser;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		dispatcher.forward(request, response);
	}
}
