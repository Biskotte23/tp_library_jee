package fr.univtours.polytech.library.dao;

import java.util.ArrayList;
import java.util.HashMap;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.univtours.polytech.library.dao.factory.BookDAO;
import fr.univtours.polytech.library.model.BookBean;

/**
 * Book DAO implementation.
 * 
 * @author Jules
 *
 */
@Stateless
public class BookDAOImpl implements BookDAO {
	@PersistenceContext(unitName = "LibraryEJB")
	private EntityManager em;

	@Override
	public void insert(BookBean book) {
		em.persist(book);

	}

	@Override
	public void update(BookBean book) {
		em.merge(book);

	}

	@Override
	public ArrayList<BookBean> getAll() {
		Query requete = em.createQuery("select b from BookBean b");
		return (ArrayList<BookBean>) requete.getResultList();
	}

	@Override
	public BookBean get(Integer id) {
		return em.find(BookBean.class, id);
	}
	
	@Override
	public ArrayList<BookBean> getAllWithFilters(String searchString, int bookTypeId, boolean available) {	
		HashMap<String, String> filters = new HashMap<String, String>();
		String stringRequest = "select b from BookBean b";
		
		if (searchString.trim().compareTo("") != 0) {
			filters.put("searchString", "UPPER(CONCAT(b.title, b.author.firstName, b.author.lastName)) LIKE :searchString");
		}
		
		if (bookTypeId != -1) {
			filters.put("bookTypeId", "b.bookType.id=:bookTypeId");
		}
		
		if (available) {
			filters.put("available", "b.available = :available");
		}
		
		// Creation of the request.
		int counter = 0;
		for(String filter : filters.values()) {
			if (counter == 0) {
				stringRequest += " where";
			} else {
				stringRequest += " and";
			}
			
			stringRequest = stringRequest + " " + filter;
			counter++;
		}
		
		// Preparation of the request.
		Query request = em.createQuery(stringRequest);
		for(String filter : filters.keySet()) {
			switch (filter) {
				case "searchString":
					searchString = "%" + searchString.toUpperCase() + "%";
					request.setParameter("searchString", searchString);
					break;
				case "bookTypeId":
					request.setParameter("bookTypeId", bookTypeId); 
					break;
				case "available":
					request.setParameter("available", available);
					break;
			}
		}
		
		return (ArrayList<BookBean>) request.getResultList();
	}
	

}
