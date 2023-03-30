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
 * 
 * @author Jules.
 *
 */
@Stateless
public class BookBusinessImpl implements BookBusinessLocal, BookBusinessRemote {
	@Inject
	private BookDAO dao;

	@Override
	public void insert(BookBean book) {
		dao.insert(book);

	}

	@Override
	public void update(BookBean book) {
		dao.update(book);

	}

	@Override
	public ArrayList<BookBean> getAll() {
		return dao.getAll();
	}

	@Override
	public BookBean get(Integer id) {
		return dao.get(id);
	}
	
	public ArrayList<BookBean> getFilteredBooks(String searchString, int bookTypeId, boolean available) {
		return dao.getAllFiltered(searchString, bookTypeId, available);
	}
}
