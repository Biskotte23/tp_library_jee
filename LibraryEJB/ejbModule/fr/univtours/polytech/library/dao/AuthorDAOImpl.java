package fr.univtours.polytech.library.dao;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	public void insert(AuthorBean object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AuthorBean object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AuthorBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorBean get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
