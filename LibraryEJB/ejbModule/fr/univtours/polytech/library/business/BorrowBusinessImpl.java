package fr.univtours.polytech.library.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.univtours.polytech.library.business.factory.local.BorrowBusinessLocal;
import fr.univtours.polytech.library.business.factory.remote.BorrowBusinessRemote;
import fr.univtours.polytech.library.dao.factory.BorrowDAO;
import fr.univtours.polytech.library.model.BorrowBean;

/**
 * Borrow business implementation.
 * 
 * @author Jules.
 *
 */
@Stateless
public class BorrowBusinessImpl implements BorrowBusinessLocal, BorrowBusinessRemote {
	@Inject
	private BorrowDAO dao;

	@Override
	public void insert(BorrowBean borrow) {
		dao.insert(borrow);

	}

	@Override
	public void update(BorrowBean borrow) {
		dao.update(borrow);

	}

	@Override
	public ArrayList<BorrowBean> getAll() {
		return dao.getAll();
	}

	@Override
	public BorrowBean get(Integer id) {
		return dao.get(id);
	}
	
	@Override
	public ArrayList<BorrowBean> getAllNotReturnedBorrow() {
		return dao.getAllNotReturned();
	}

	@Override
	public ArrayList<BorrowBean> getBorrowsNotRetunedOfuser(int userID) {
		return dao.getBorrowsNotRetunedOfuser(userID);
	}
}
