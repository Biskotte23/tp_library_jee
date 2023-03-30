package fr.univtours.polytech.library.dao;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.univtours.polytech.library.dao.factory.BookTypeDAO;
import fr.univtours.polytech.library.model.BookTypeBean;

/**
 * Book type DAO implementation.
 * 
 * @author Jules
 *
 */
@Stateless
public class BookTypeDAOImpl implements BookTypeDAO {
	@PersistenceContext(unitName = "LibraryEJB")
	private EntityManager em;

	@Override
	public void insert(BookTypeBean bookType) {
		em.persist(bookType);
	}

	@Override
	public void update(BookTypeBean bookType) {
		em.merge(bookType);
	}

	@Override
	public ArrayList<BookTypeBean> getAll() {
		Query requete = em.createQuery("select bt from BookTypeBean bt");
		return (ArrayList<BookTypeBean>) requete.getResultList();
	}

	@Override
	public BookTypeBean get(Integer id) {
		return em.find(BookTypeBean.class, id);
	}
}
