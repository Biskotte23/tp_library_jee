package fr.univtours.polytech.library.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.univtours.polytech.library.business.factory.local.AuthorBsuniessLocal;
import fr.univtours.polytech.library.business.factory.remote.AuthorBusinessRemote;
import fr.univtours.polytech.library.dao.factory.AuthorDAO;
import fr.univtours.polytech.library.model.AuthorBean;

/**
 * Author business implementation.
 * @author Jules.
 *
 */
@Stateless
public class AuthorBusinessImpl implements AuthorBsuniessLocal, AuthorBusinessRemote {
	@Inject
	private AuthorDAO dao;
	
	@Override
	public void insert(AuthorBean object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(AuthorBean object) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<AuthorBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorBean get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
