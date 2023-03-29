package fr.univtours.polytech.library.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.univtours.polytech.library.dao.factory.BorrowDAO;
import fr.univtours.polytech.library.model.BorrowBean;

public class BorrowDAOImpl implements BorrowDAO {
	@PersistenceContext(unitName = "LibraryEJB")
    private EntityManager em;
	
	@Override
	public void insert(BorrowBean object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BorrowBean object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BorrowBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BorrowBean get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
