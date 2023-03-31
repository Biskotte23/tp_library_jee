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
	
	/**
	 * Get filtered books.
	 * @param searchString Search string.
	 * @param bookTypeId ID of the book type.
	 * @param available Whether the books must be available or not.
	 * @return Filtered books.
	 */
	@Override
	public ArrayList<BookBean> getFilteredBooks(String searchString, int bookTypeId, boolean available) {
		return dao.getAllWithFilters(searchString, bookTypeId, available);
	}
}
