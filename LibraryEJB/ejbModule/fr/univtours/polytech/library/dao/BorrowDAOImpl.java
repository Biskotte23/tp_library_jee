package fr.univtours.polytech.library.dao;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.univtours.polytech.library.dao.factory.BorrowDAO;
import fr.univtours.polytech.library.model.BorrowBean;

/**
 * Borrow DAO implementation.
 * 
 * @author Jules
 *
 */
@Stateless
public class BorrowDAOImpl implements BorrowDAO {
	@PersistenceContext(unitName = "LibraryEJB")
	private EntityManager em;

	@Override
	public void insert(BorrowBean borrow) {
		em.persist(borrow);

	}

	@Override
	public void update(BorrowBean borrow) {
		em.merge(borrow);
	}

	@Override
	public ArrayList<BorrowBean> getAll() {
		Query requete = em.createQuery("select b from BorrowBean b");
		return (ArrayList<BorrowBean>) requete.getResultList();
	}

	@Override
	public BorrowBean get(Integer id) {
		return em.find(BorrowBean.class, id);
	}

	@Override
	public ArrayList<BorrowBean> getAllNotReturned() {
		Query requete = em.createQuery("select b from BorrowBean b where b.renderingDate = NULL");
		return (ArrayList<BorrowBean>) requete.getResultList();
	}

	@Override
	public ArrayList<BorrowBean> getBorrowsOfuser(int userID) {
		Query query = em.createQuery("select b from BorrowBean b where b.user.id = :userID");
		query.setParameter("userID", userID);
		return (ArrayList<BorrowBean>) query.getResultList();
	}
}
