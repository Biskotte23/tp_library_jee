package fr.univtours.polytech.library.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.univtours.polytech.library.business.factory.local.UserBusinessLocal;
import fr.univtours.polytech.library.business.factory.remote.UserBusinessRemote;
import fr.univtours.polytech.library.dao.factory.UserDAO;
import fr.univtours.polytech.library.model.UserBean;

/**
 * User business implementation.
 * 
 * @author Jules.
 *
 */
@Stateless
public class UserBusinessImpl implements UserBusinessLocal, UserBusinessRemote {
	@Inject
	private UserDAO dao;

	@Override
	public void insert(UserBean user) {
		dao.insert(user);

	}

	@Override
	public void update(UserBean user) {
		dao.update(user);

	}

	@Override
	public ArrayList<UserBean> getAll() {
		return dao.getAll();
	}

	@Override
	public UserBean get(Integer id) {
		return dao.get(id);
	}
}
