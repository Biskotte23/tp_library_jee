package fr.univtours.polytech.library.business.factory.local;

import java.util.ArrayList;

import fr.univtours.polytech.library.model.BorrowBean;

/**
 * Borrow business local interface.
 * 
 * @author Jules.
 *
 */
public interface BorrowBusinessLocal extends BusinessLocalFactory<BorrowBean> {
	public ArrayList<BorrowBean> getAllNotReturnedBorrow();

	/**
	 * Get the borrows made by a user.
	 * @param userID ID of the user.
	 * @return Borrows made by a user.
	 */
	public ArrayList<BorrowBean> getBorrowsNotRetunedOfuser(int userID);
}
