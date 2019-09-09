package lgt.crud.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lgt.crud.bean.User;
import lgt.crud.service.LoginService;
import lgt.crud.until.RandUtil;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = {"/login"}, method = {RequestMethod.POST})
	@ResponseBody
	public Object logincheck(HttpServletRequest request) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(userName);
		System.out.println(password);
		User user = new User();
		user.setPhoneNumber(userName);
		user.setMail(userName);
		user.setPassword(password);
		if(loginService.logincheck(user)!= null) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("code", 1);
			return map;
		}else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("code", 0);
			return map;
		}
		
	}
	
	@RequestMapping(value = {"/register"},method = {RequestMethod.POST})
	@ResponseBody
	public Object register(HttpServletRequest request) {
		String uuid = UUID.randomUUID().toString();
		String id = uuid.replace("-", "");
		String cardId = request.getParameter("cardId");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String mail = request.getParameter("mail");
		String phoneNumber = request.getParameter("phoneNumber");
		User user = new User();
		user.setId(id);
		user.setCardId(cardId);
		user.setName(name);
		user.setPassword(password);
		user.setMail(mail);
		user.setPhoneNumber(phoneNumber);
		loginService.register(user);
        Map map = new HashMap();
        map.put("code",1);
        return  map;
	}

}
