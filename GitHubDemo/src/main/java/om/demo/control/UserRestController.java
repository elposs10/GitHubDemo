package om.demo.control;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import om.demo.entity.User;
import om.demo.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	UserService userServ;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers() {
	List<User> list = userServ.retrieveAllUsers();
	return list;
	}
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-user/{user-id}
	@GetMapping("/retrieve-user/{user-id}")
	@ResponseBody
	public User retrieveUser(@PathVariable("user-id") String userId) {
	return userServ.retrieveUser(userId);
	}
	
	// http://localhost:8081/SpringMVC/servlet/add-user
	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User u) {
	User user = userServ.addUser(u);
	return user;
	}
	
	// http://localhost:8081/SpringMVC/servlet/remove-user/{user-id}
	@DeleteMapping("/remove-user/{user-id}")
	@ResponseBody
	public void removeUser(@PathVariable("user-id") String userId) {
	userServ.deleteUser(userId);
	}

	// http://localhost:8081/SpringMVC/servlet/modify-user
	@PutMapping("/modify-user")
	@ResponseBody
	public User modifyUser(@RequestBody User user) {
	return userServ.addUser(user);
	}

}
