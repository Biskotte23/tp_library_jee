package fr.univtours.polytech.library.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.univtours.polytech.library.dao.DAO;
import fr.univtours.polytech.library.model.BookTypeBean;

@Stateless
public class BookTypesBusinessImpl implements BookTypesBusinessLocal, BookTypesBusinessRemote {
	@Inject
	private DAO<BookTypeBean> dao;

	@Override
	public List<BookTypeBean> getBookTypeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookTypeBean getBookType(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBookType(BookTypeBean bookType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookType(BookTypeBean bookType) {
		// TODO Auto-generated method stub
		
	}
}
