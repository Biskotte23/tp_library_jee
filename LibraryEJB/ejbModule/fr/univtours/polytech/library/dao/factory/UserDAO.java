package fr.univtours.polytech.library.dao.factory;

import fr.univtours.polytech.library.model.UserBean;

public interface UserDAO extends DAOFactory<UserBean> {
	
	public UserBean searchUser(String login, String password);
}
