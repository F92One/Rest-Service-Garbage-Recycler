package service;

/*
* @author: Oneto, Fernando
* @author: Diez, Lautaro
*/
import java.util.List;

import model.User;

public interface UserService {
	User register(User user);	// register a new user

	User findByUsername (String username); // find a user by its surname

	//List<User> getAllUsers(); //delete
}
