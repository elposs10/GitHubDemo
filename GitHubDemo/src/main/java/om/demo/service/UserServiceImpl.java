package om.demo.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import om.demo.entity.User;
import om.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;
	
	private static final Logger L = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<User> retrieveAllUsers() {
		List<User> users = (List<User>) userRepo.findAll();
		for (User user : users) {
			L.info("user +++ : " + user);
		}
		return users;
	}

	@Override
	public User retrieveUser(String Id) {
		return userRepo.findById(Long.parseLong(Id)).get();
	}

	@Override
	public User addUser(User u) {
		return userRepo.save(u);
	}

	@Override
	public void deleteUser(String Id) {
		userRepo.deleteById(Long.parseLong(Id));
	}
	
	

}
