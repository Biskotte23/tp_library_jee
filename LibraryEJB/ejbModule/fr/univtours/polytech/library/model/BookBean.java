package fr.univtours.polytech.library.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Book.
 * @author Jules
 *
 */
@Entity
@Table(name = "Book")
public class BookBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/**
	 * Title of the book.
	 */
	private String title;
	
	/**
	 * Whether the book is available for borrowing. 
	 */
	private boolean available;
	
	/**
	 * Cover image of the book.
	 */
	private byte[] cover;
	
	/**
	 * Get the ID of the book.
	 * @return ID of the book.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the ID of the book.
	 * @param id New ID of the book.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get the title of the book.
	 * @return Title of the book.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the title of the book.
	 * @param title New title of the book.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Whether the book if available for borrowing of not.
	 * @return Availability of the book for borrowing.
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * Set the availability of the book for borrowing.
	 * @param available New availability of the book for borrowing.
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/**
	 * Get the cover image of the book.
	 * @return Cover image of the book.
	 */
	public byte[] getCover() {
		return cover;
	}

	/**
	 * Set the cover image of the book.
	 * @param cover New cover image of the book.
	 */
	public void setCover(byte[] cover) {
		this.cover = cover;
	}
}
