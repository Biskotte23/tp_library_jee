package fr.univtours.polytech.library.dao;

import java.util.List;

import fr.univtours.polytech.library.model.BookTypeBean;

public interface BookTypesDAO {
	public List<BookTypeBean> getBookTypeList();

	public BookTypeBean getBookType(Integer id);

	public void insertBookType(BookTypeBean bookType);

	public void updateBookType(BookTypeBean bookType);
}
