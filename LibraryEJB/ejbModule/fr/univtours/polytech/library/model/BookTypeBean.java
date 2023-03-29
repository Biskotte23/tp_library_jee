package fr.univtours.polytech.library.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Type of a book.
 * @author Jules
 *
 */
@Entity
@Table(name = "Book_Type")
public class BookTypeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/**
	 * Name of the book type.
	 */
	private String name;
	
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
}
