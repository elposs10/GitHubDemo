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

import om.demo.entity.Login;
import om.demo.service.LoginService;

@RestController
public class LoginRestController {
	
	@Autowired
	LoginService logServ;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-log-creds
		@GetMapping("/retrieve-all-log-creds")
		@ResponseBody
		public List<Login> getLogCreds() {
		List<Login> list = logServ.retrieveAllLogCreds();
		return list;
		}
		
		// http://localhost:8081/SpringMVC/servlet/retrieve-log-cred/{log-id}
		@GetMapping("/retrieve-log-cred/{log-id}")
		@ResponseBody
		public Login retrieveLog(@PathVariable("user-id") String logID) {
		return logServ.retrieveLogCreds(logID);
		}
		
		// http://localhost:8081/SpringMVC/servlet/add-user
		@PostMapping("/add-user")
		@ResponseBody
		public Login addLogCreds(@RequestBody Login l) {
		Login login = logServ.addLogCreds(l);
		return login;
		}
		
		// http://localhost:8081/SpringMVC/servlet/remove-log-creds/{log-id}
		@DeleteMapping("/remove-log-creds/{log-id}")
		@ResponseBody
		public void removeLog(@PathVariable("log-id") String logID) {
		logServ.deleteLogCreds(logID);
		}

		// http://localhost:8081/SpringMVC/servlet/modify-log-creds
		@PutMapping("/modify-log-creds")
		@ResponseBody
		public Login modifyLog(@RequestBody Login login) {
		return logServ.addLogCreds(login);
		}
	
	

}
