package fr.ema.lgi2p.m2.ForumProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<User> listTodo() {
		Session session = this.sessionFactory.getCurrentSession();
		Query<User> query = session.createQuery("From Todo", User.class);
		return query.getResultList();
	}

	public User newUser(User newUser) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(newUser);

		return newUser;
	}

}
