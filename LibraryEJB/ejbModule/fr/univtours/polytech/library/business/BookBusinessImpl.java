package fr.univtours.polytech.library.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.univtours.polytech.library.business.factory.local.BookBusinessLocal;
import fr.univtours.polytech.library.business.factory.remote.BookBusinessRemote;
import fr.univtours.polytech.library.dao.factory.BookDAO;
import fr.univtours.polytech.library.model.BookBean;

/**
 * Book business implementation.
 * @author Jules.
 *
 */
@Stateless
public class BookBusinessImpl implements BookBusinessLocal, BookBusinessRemote {
	@Inject
	private BookDAO dao;
	
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
