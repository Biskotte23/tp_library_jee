package fr.univtours.polytech.library.business.factory.remote;

import fr.univtours.polytech.library.model.UserBean;

/**
 * User business remote interface.
 * @author Jules.
 *
 */
public interface UserBusinessRemote extends BusinessRemoteFactory<UserBean> {
	public UserBean searchUser(String login, String password);
}
