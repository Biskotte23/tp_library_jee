package fr.univtours.polytech.library.dao.factory;

import java.util.ArrayList;

import fr.univtours.polytech.library.model.BookBean;

public interface BookDAO extends DAOFactory<BookBean> {
	/**
	 * Get filtered books.
	 * @param searchString Search string.
	 * @param bookTypeId ID of the book type.
	 * @param available Whether the books must be available or not.
	 * @return Filtered books.
	 */
	public ArrayList<BookBean> getAllWithFilters(String searchString, int bookTypeId, boolean available);
}
