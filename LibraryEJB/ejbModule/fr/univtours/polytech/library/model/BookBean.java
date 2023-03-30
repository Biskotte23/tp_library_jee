package fr.univtours.polytech.library.model;

import java.io.Serializable;
import java.util.Base64;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Book.
 * @author Jules.
 *
 */
@Entity
@Table(name = "Book")
public class BookBean implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID of the user. 
	 */
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
	// @LOB
	private byte[] cover;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private BookTypeBean bookType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private AuthorBean author;
	
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

	/**
	 * Get the type of the book.
	 * @return Type of the book.
	 */
	public BookTypeBean getBookType() {
		return bookType;
	}

	/**
	 * Set the type of the book.
	 * @param bookType New type of the book.
	 */
	public void setBookType(BookTypeBean bookType) {
		this.bookType = bookType;
	}

	/**
	 * Get the author of the book.
	 * @return Author of the book.
	 */
	public AuthorBean getAuthor() {
		return author;
	}

	/**
	 * Set the author of the book.
	 * @param author New author of the book.
	 */
	public void setAuthor(AuthorBean author) {
		this.author = author;
	}
	
	/**
	* Transform the byte[] with picture data into String.
	* @return Sring allowing picture display.
	*/
	public String getBase64Image() {
	    return Base64.getEncoder().encodeToString(cover);
	}
}
