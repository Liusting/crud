package lgt.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lgt.crud.bean.User;
import lgt.crud.dao.LoginMapper;

@Service
public class LoginService {

	@Autowired
    LoginMapper loginMapper;
	
	public User logincheck(User user) {
		User user1 = loginMapper.logincheck(user);
		return user1;
	}
	
   public void register(User user) {
	   loginMapper.register(user);
   }
	
}
