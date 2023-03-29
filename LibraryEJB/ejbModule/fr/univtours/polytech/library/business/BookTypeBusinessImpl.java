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
		return dao.getAll();
	}

	@Override
	public BookTypeBean get(Integer id) {
		return dao.get(id);
	}

	@Override
	public void insert(BookTypeBean bookType) {
		dao.insert(bookType);
	}

	@Override
	public void update(BookTypeBean bookType) {
		dao.update(bookType);
	}
}
