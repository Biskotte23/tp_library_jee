package fr.univtours.polytech.library.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.univtours.polytech.library.dao.factory.UserDAO;
import fr.univtours.polytech.library.model.UserBean;

/**
 * User DAO implementation.
 * @author Jules
 *
 */
public class UserDAOImpl implements UserDAO {
	@PersistenceContext(unitName = "LibraryEJB")
    private EntityManager em;
	
	@Override
	public void insert(UserBean object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserBean object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<UserBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBean get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
