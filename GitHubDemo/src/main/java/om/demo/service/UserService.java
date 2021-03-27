package om.demo.service;

import java.util.List;

import om.demo.entity.User;

public interface UserService {
	
	List<User> retrieveAllUsers();
	User retrieveUser(String Id);
	User addUser(User u);
	void deleteUser(String Id);

}
