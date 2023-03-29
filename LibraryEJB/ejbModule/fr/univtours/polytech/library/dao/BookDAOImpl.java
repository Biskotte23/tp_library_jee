package fr.univtours.polytech.library.dao;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.univtours.polytech.library.dao.factory.BookDAO;
import fr.univtours.polytech.library.model.BookBean;

/**
 * Book DAO implementation.
 * @author Jules
 *
 */
@Stateless
public class BookDAOImpl implements BookDAO {
	@PersistenceContext(unitName = "LibraryEJB")
    private EntityManager em;
	
	@Override
	public void insert(BookBean object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BookBean object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BookBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookBean get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
