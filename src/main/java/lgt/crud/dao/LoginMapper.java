package lgt.crud.dao;

import lgt.crud.bean.User;

public interface LoginMapper {
	
	    //登录验证
		User logincheck(User user);
		//注册
	    void register(User user);

}
