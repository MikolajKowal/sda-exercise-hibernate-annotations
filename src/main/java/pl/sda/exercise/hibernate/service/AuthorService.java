package pl.sda.exercise.hibernate.service;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import pl.sda.exercise.hibernate.model.Author;

public class AuthorService {

	private SessionFactory sessionFactory;
	
	
	public AuthorService() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}


	public List<Author> getAuthors() {
		Session session = sessionFactory.openSession();
		Query<Author> query = session.createNamedQuery("getAuthorQuery", Author.class);
		List<Author> listToReturn = query.list();
		session.close();
		return listToReturn;
	}

}
