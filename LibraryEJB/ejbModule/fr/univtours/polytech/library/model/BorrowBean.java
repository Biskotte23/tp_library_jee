package fr.univtours.polytech.library.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Borrow of a book by a user.
 * 
 * @user Jules
 *
 */
@Entity
@Table(name = "Borrow")
public class BorrowBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * Date of the borrow.
	 */
	private LocalDateTime date;

	/**
	 * Borrowed book.
	 */
	private BookBean book;

	/**
	 * Borrower user.
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	private UserBean user;

	/**
	 * Get the ID of the borrow.
	 * 
	 * @return ID of the borrow.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the ID of the borrow.
	 * 
	 * @param id New ID of the borrow.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get the date of the borrow.
	 * 
	 * @return Date of the borrow.
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * Set the date of the borrow.
	 * 
	 * @param date New date of the borrow.
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * Get the borrowed book.
	 * 
	 * @return Borrowed book.
	 */
	public BookBean getBook() {
		return book;
	}

	/**
	 * Set the borrowed book.
	 * 
	 * @param book New borrowed book.
	 */
	public void setBook(BookBean book) {
		this.book = book;
	}

	/**
	 * Get the borrower user.
	 * 
	 * @return Borrower user.
	 */
	public UserBean getUser() {
		return user;
	}

	/**
	 * Set the borrower user.
	 * 
	 * @param user New borrower user.
	 */
	public void setUser(UserBean user) {
		this.user = user;
	}
}
