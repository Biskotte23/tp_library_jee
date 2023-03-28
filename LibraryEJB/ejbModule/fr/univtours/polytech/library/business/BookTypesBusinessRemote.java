package fr.univtours.polytech.library.business;

import java.util.List;

import javax.ejb.Remote;

import fr.univtours.polytech.library.model.BookTypeBean;

@Remote
public interface BookTypesBusinessRemote {
	public List<BookTypeBean> getBookTypeList();

	public BookTypeBean getBookType(Integer id);

	public void insertBookType(BookTypeBean bookType);

	public void updateBookType(BookTypeBean bookType);
}
