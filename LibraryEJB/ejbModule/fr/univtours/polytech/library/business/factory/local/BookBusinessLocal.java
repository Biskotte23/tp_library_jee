package fr.univtours.polytech.library.business.factory.local;

import java.util.ArrayList;

import fr.univtours.polytech.library.model.BookBean;

/**
 * Book business local interface.
 * @author Jules.
 *
 */
public interface BookBusinessLocal extends BusinessLocalFactory<BookBean> {
	/**
	 * Get filtered books.
	 * @param searchString Search string.
	 * @param bookTypeId ID of the book type.
	 * @param available Whether the books must be available or not.
	 * @return Filtered books.
	 */
	public ArrayList<BookBean> getFilteredBooks(String searchString, int bookTypeId, boolean available);
}
