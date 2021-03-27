package om.demo.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import om.demo.entity.Login;
import om.demo.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository logRepo;
	
	private static final Logger L = LogManager.getLogger(LoginServiceImpl.class);

	@Override
	public List<Login> retrieveAllLogCreds() {
		List<Login> logs = (List<Login>) logRepo.findAll();
		for (Login login : logs) {
			L.info("user +++ : " + login);
		}
		return logs;
	}

	@Override
	public Login retrieveLogCreds(String Id) {
		return logRepo.findById(Long.parseLong(Id)).get();
	}

	@Override
	public Login addLogCreds(Login l) {
		return logRepo.save(l);
	}

	@Override
	public void deleteLogCreds(String Id) {
		logRepo.deleteById(Long.parseLong(Id));
		
	}
	
	

}
