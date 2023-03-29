package fr.univtours.polytech.library.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.univtours.polytech.library.business.factory.local.AuthorBusinessLocal;
import fr.univtours.polytech.library.business.factory.remote.AuthorBusinessRemote;
import fr.univtours.polytech.library.dao.factory.AuthorDAO;
import fr.univtours.polytech.library.model.AuthorBean;

/**
 * Author business implementation.
 * 
 * @author Jules.
 *
 */
@Stateless
public class AuthorBusinessImpl implements AuthorBusinessLocal, AuthorBusinessRemote {
	@Inject
	private AuthorDAO dao;

	@Override
	public void insert(AuthorBean author) {
		dao.insert(author);

	}

	@Override
	public void update(AuthorBean author) {
		dao.update(author);

	}

	@Override
	public ArrayList<AuthorBean> getAll() {
		return dao.getAll();
	}

	@Override
	public AuthorBean get(Integer id) {
		return dao.get(id);
	}
}
