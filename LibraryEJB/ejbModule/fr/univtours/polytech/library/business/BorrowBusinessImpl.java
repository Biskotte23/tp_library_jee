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
 * @author Jules.
 *
 */
@Stateless
public class BorrowBusinessImpl implements BorrowBusinessLocal, BorrowBusinessRemote {
	@Inject
	private BorrowDAO dao;
	
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
