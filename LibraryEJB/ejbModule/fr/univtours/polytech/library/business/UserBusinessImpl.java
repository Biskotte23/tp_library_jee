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
 * @author Jules.
 *
 */
@Stateless
public class UserBusinessImpl implements UserBusinessLocal, UserBusinessRemote {
	@Inject
	private UserDAO dao;
	
	@Override
	public void insert(UserBean object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserBean object) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<UserBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBean get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
