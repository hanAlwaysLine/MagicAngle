package cn.manage.mapper;

import java.util.List;

import javax.persistence.MappedSuperclass;

import org.springframework.stereotype.Repository;

import cn.manage.bean.UserBean;

@Repository
public interface UserMapper  {
	List<UserBean> getUser();
	
}
