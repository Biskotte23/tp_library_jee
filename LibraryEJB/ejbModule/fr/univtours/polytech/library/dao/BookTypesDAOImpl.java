package fr.univtours.polytech.library.dao;

import java.util.ArrayList;

import javax.ejb.Stateless;

import fr.univtours.polytech.library.model.BookTypeBean;

/**
 * Book type DAO implementation.
 * @author Jules
 *
 */
@Stateless
public class BookTypesDAOImpl implements DAO<BookTypeBean> {
	@Override
	public void insert(BookTypeBean bookType) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(BookTypeBean bookType) {
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<BookTypeBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookTypeBean get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
