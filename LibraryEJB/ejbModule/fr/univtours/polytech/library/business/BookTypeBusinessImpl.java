package fr.univtours.polytech.library.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.univtours.polytech.library.business.factory.local.BookTypeBusinessLocal;
import fr.univtours.polytech.library.business.factory.remote.BookTypeBusinessRemote;
import fr.univtours.polytech.library.dao.factory.BookTypeDAO;
import fr.univtours.polytech.library.model.BookTypeBean;

/**
 * Book type business implementation.
 * @author Jules.
 *
 */
@Stateless
public class BookTypeBusinessImpl implements BookTypeBusinessLocal, BookTypeBusinessRemote {
	@Inject
	private BookTypeDAO dao;

	@Override
	public ArrayList<BookTypeBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookTypeBean get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(BookTypeBean bookType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BookTypeBean bookType) {
		// TODO Auto-generated method stub
		
	}
}
