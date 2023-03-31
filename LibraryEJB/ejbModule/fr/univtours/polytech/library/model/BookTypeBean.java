package fr.univtours.polytech.library.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Type of a book.
 * @author Jules.
 *
 */
@Entity
@Table(name = "Book_Type")
public class BookTypeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID of the book type.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/**
	 * Name of the book type.
	 */
	private String name;
	
		/**
	 * Books of the type.
	 */
	@OneToMany(mappedBy = "bookType")
	private List<BookBean> books;
	
	/**
	 * Get the ID of the book type.
	 * @return ID of the book type.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the ID of the book type.
	 * @param id New ID of the book type.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get the name of the book type.
	 * @return name of the book type.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the book type.
	 * @param name New name of the book type.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the books of the type.
	 * @return Books of the type.
	 */
	public List<BookBean> getBooks() {
		return books;
	}

	/**
	 * Set the books of the type.
	 * @param books New books of the type.
	 */
	public void setBooks(List<BookBean> books) {
		this.books = books;
	}
}
