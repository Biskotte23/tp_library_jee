package fr.univtours.polytech.library.dao;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.univtours.polytech.library.dao.factory.AuthorDAO;
import fr.univtours.polytech.library.model.AuthorBean;

/**
 * Author DAO implementation.
 * @author Jules
 *
 */
@Stateless
public class AuthorDAOImpl implements AuthorDAO {
	@PersistenceContext(unitName = "LibraryEJB")
    private EntityManager em;
	
	@Override
	public void insert(AuthorBean author) {
		 em.persist(author);
		
	}

	@Override
	public void update(AuthorBean author) {
		em.merge(author);	
	}

	@Override
	public ArrayList<AuthorBean> getAll() {
		Query requete = em.createQuery("select b from AuthorBean b");
		return (ArrayList<AuthorBean>) requete.getResultList();
	}

	@Override
	public AuthorBean get(Integer id) {
		return em.find(AuthorBean.class, id);
	}

}
