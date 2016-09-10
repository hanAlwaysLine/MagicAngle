package cn.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.manage.dao.UserDao;
import cn.manage.entity.User;
@Service
@Scope("prototype")
public class UserService {
	@Autowired
	private UserDao dao;
	@Transactional
	public void save(User user){
     	System.out.println("service中保存user");
		dao.save(user);
	}
}
 