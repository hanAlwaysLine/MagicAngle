package cn.manage.mapperService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.manage.bean.UserBean;
import cn.manage.mapper.UserMapper;

@Service("userMapperService")
@Scope("prototype")
public class UserMapperService {
	@Autowired
	private UserMapper userMapper;

	public List<UserBean> getUser() {
		// TODO Auto-generated method stub
		System.out.println("=========================");
		return userMapper.getUser();
	}

}
