package fr.ema.lgi2p.m2.ForumProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String listeUsers() {
		return "{users:[]}";
	}

	 @Autowired
	 private UserDao userDao;

	  @RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	 public User getTodo(@PathVariable int id) {
	 User user = new User("todo-" + id, false);
	 userDao.newUser(user);
	 return user;
	 }

}
