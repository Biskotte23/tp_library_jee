package fr.univtours.polytech.library.dao.factory;

import java.util.ArrayList;

import fr.univtours.polytech.library.model.BorrowBean;

public interface BorrowDAO extends DAOFactory<BorrowBean> {
	public ArrayList<BorrowBean> getAllNotReturned();

	/**
	 * Get the borrows made by a user.
	 * @param userID ID of the user.
	 * @return Borrows made by a user.
	 */
	public ArrayList<BorrowBean> getBorrowsNotRetunedOfuser(int userID);
}
