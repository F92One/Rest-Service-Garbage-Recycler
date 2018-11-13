package service;
/*
* @author: Oneto, Fernando
* @author: Diez, Lautaro
*/
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.User;
import repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository ur;

	@Override
	public User register(User user) {
		return ur.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return ur.findByUsername(username);
	}
/*
	@Override
	public List<User> getAllUsers() {
		return ur.findBy();
	}
*/


}
