package fr.univtours.polytech.library.dao.factory;

import java.util.ArrayList;

import fr.univtours.polytech.library.model.BorrowBean;

public interface BorrowDAO extends DAOFactory<BorrowBean> {

	public ArrayList<BorrowBean> getAllNotReturned();

}
