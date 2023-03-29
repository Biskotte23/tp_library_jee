package fr.univtours.polytech.library.dao;

import java.util.ArrayList;

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
	public void update(BookBean object) {
		// TODO Auto-generated method stub

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

}
