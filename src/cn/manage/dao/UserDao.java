package cn.manage.dao;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import cn.manage.baseInterface.BaseDaoSession;
import cn.manage.entity.User;

@Scope("prototype")
@Repository
public class UserDao  {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(User user){
		
		System.out.println("dao中保存user");
		sessionFactory.getCurrentSession().save(user);

	}
	
}
