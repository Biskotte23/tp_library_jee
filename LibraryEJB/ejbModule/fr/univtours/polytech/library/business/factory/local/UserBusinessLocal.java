package fr.univtours.polytech.library.business.factory.local;

import fr.univtours.polytech.library.model.UserBean;

/**
 * User business local interface.
 * @author Jules.
 *
 */
public interface UserBusinessLocal extends BusinessLocalFactory<UserBean> {
	public UserBean searchUser(String login, String password);
}
