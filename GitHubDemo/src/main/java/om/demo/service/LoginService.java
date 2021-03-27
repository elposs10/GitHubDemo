package om.demo.service;

import java.util.List;

import om.demo.entity.Login;

public interface LoginService {
	
	List<Login> retrieveAllLogCreds();
	Login retrieveLogCreds(String Id);
	Login addLogCreds(Login l);
	void deleteLogCreds(String Id);

}
