package fr.univtours.polytech.library.business.factory;

import java.util.ArrayList;

import javax.ejb.Remote;

/**
 * Business Remote factory.
 * @author Jules.
 *
 * @param <T> Business class.
 */
@Remote
public interface BusinessRemoteFactory<T> {
	/**
	 * Insert a new object.
	 * @param object Object to insert.
	 */
	public void insert(T object);

	/**
	 * Update an object.
	 * @param object Updated object.
	 */
	public void update(T object);
	
	/**
	 * Get object list.
	 * @return Object list.
	 */
	public ArrayList<T> getAll();

	/**
	 * Get an object with its ID.
	 * @param id ID of the object.
	 * @return Object object.
	 */
	public T get(Integer id);
}
