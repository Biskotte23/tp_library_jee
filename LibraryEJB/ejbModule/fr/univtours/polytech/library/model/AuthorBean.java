package fr.univtours.polytech.library.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Author of a book.
 * @author Jules
 *
 */
@Entity
@Table(name = "Author")
public class AuthorBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/**
	 * First name of the author.
	 */
	private String firstName;
	
	/**
	 * Last name of the author.
	 */
	private String lastName;
	
	@OneToMany(mappedBy = "author")
	private List<BookBean> books;
	
	/**
	 * Get the ID of the author.
	 * @return ID of the author.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the ID of the auhtor.
	 * @param id New ID of the author.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get the first name of the author.
	 * @return First name of the author.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the first name of the author.
	 * @param firstName New first name of the author.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get the last name of the author.
	 * @return Last name of the author.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name of the author.
	 * @param lastName New last name of the author. 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the books
	 */
	public List<BookBean> getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(List<BookBean> books) {
		this.books = books;
	}
	
	
}
