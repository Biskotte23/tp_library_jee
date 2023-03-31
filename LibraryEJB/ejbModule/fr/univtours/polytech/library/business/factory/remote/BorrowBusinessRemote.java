package fr.univtours.polytech.library.business.factory.remote;

import java.util.ArrayList;

import fr.univtours.polytech.library.model.BorrowBean;

/**
 * Borrow business remote interface.
 * 
 * @author Jules.
 *
 */
public interface BorrowBusinessRemote extends BusinessRemoteFactory<BorrowBean> {
	public ArrayList<BorrowBean> getAllNotReturnedBorrow();
}
