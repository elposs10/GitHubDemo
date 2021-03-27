package om.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import om.demo.entity.User;
import om.demo.repository.UserRepository;
import om.demo.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
	
	private static final Logger l = LogManager.getLogger(UserServiceImplTest.class);
	
	@Autowired
	UserServiceImpl us;
	
	@Autowired
	UserRepository ur;
	
	@Test
	public void testretrieveAllUsers() {
		us.retrieveAllUsers();
	}
	
	@Test
	public void testretrieveUser() {
		User u = ur.findById(Long.parseLong("1")).get();
		us.retrieveUser("1").getClass();
		System.out.println(u);
	}
	
	@Test
	public void testAddUser() throws java.text.ParseException {
		User u = new User(Long.parseLong("1"),"Oussema","Mihoubi",25,"Ariana");
		us.addUser(u);
		
	}
	
	@Test
	public void testdeleteUser() {
		us.deleteUser("1");
	}
	
	@Test
	public void testupdateUser() {
		User u = ur.findById(Long.parseLong("1")).get();
		u.setAdress("Tunis");
		us.addUser(u);
	}

}
