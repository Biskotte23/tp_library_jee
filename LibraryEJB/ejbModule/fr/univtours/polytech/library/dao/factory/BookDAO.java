package fr.univtours.polytech.library.dao.factory;

import java.util.ArrayList;

import fr.univtours.polytech.library.model.BookBean;

public interface BookDAO extends DAOFactory<BookBean> {

	public ArrayList<BookBean> getAllFiltered(String searchString, int bookTypeId, boolean available);
}
