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
 * User of the app.
 * @user Jules.
 *
 */
@Entity
@Table(name = "App_User")
public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * ID of the user. 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/**
	 * First name of the user.
	 */
	private String firstName;
	
	/**
	 * Last name of the user.
	 */
	private String lastName;
	
	/**
	 * Login of the user.
	 */
	private String login;
	
	/**
	 * password of the user.
	 */
	private String password;
	
	/**
	 * Borrows made by the user.
	 */
	@OneToMany(mappedBy ="user" , cascade = CascadeType.ALL)
	private List<BorrowBean> borrows;
	
	/**
	 * Status of the user.
	 */
	private UserStatus status;
	
	/**
	 * Get the ID of the user.
	 * @return ID of the user.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the ID of the auhtor.
	 * @param id New ID of the user.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get the first name of the user.
	 * @return First name of the user.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the first name of the user.
	 * @param firstName New first name of the user.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get the last name of the user.
	 * @return Last name of the user.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name of the user.
	 * @param lastName New last name of the user. 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Get the login of the user.
	 * @return Login of the user.
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Set the login of the user.
	 * @param login New login of the user. 
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/**
	 * Get the status of the user.
	 * @return Status of the user.
	 */
	public UserStatus getStatus() {
		return status;
	}
	
	/**
	 * Set the status of the user.
	 * @param status New status of the user.
	 */
	public void setStatus(UserStatus status) {
		this.status = status;
	}

	/**
	 * Get the password of the user.
	 * @return Password of the user. 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password of the user.
	 * @param password New password of the user.
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
