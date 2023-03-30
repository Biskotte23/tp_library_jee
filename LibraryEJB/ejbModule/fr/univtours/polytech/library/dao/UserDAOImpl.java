package fr.univtours.polytech.library.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.univtours.polytech.library.dao.factory.UserDAO;
import fr.univtours.polytech.library.model.UserBean;

/**
 * User DAO implementation.
 * 
 * @author Jules
 *
 */
@Stateless
public class UserDAOImpl implements UserDAO {
	@PersistenceContext(unitName = "LibraryEJB")
	private EntityManager em;

	@Override
	public void insert(UserBean user) {
		em.persist(user);

	}

	@Override
	public void update(UserBean user) {
		em.merge(user);

	}

	@Override
	public ArrayList<UserBean> getAll() {
		Query requete = em.createQuery("select u from UserBean u");
		return (ArrayList<UserBean>) requete.getResultList();
	}

	@Override
	public UserBean get(Integer id) {
		return em.find(UserBean.class, id);
	}

	@Override
	public UserBean searchUser(String login, String password) {
		UserBean user = null;
		Query requete = em.createQuery("select u from UserBean u where u.login = :login and u.password = :password");
		requete.setParameter("login", login);
		requete.setParameter("password", password);
		List<Object> listeResult = requete.getResultList();
		if (listeResult.size() > 0) {
			user = (UserBean) listeResult.get(0);
		}

		return user;
	}

}
