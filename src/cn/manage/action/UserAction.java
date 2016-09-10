package cn.manage.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.manage.entity.User;
import cn.manage.mapperService.UserMapperService;
import cn.manage.service.UserService;
@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {

	@Autowired
	private UserService userSer;
	@Autowired
	private UserMapperService userMapperService;

	private User user;
	
	@Override
	public String execute() throws Exception {
		
		userSer.save(user);

		System.out.println("Action中保存user");
		System.out.println("=============="+userMapperService.getUser().get(2).getUsername());
		return "success";
	}


	public User getModel() {
		if(user==null){
			user = new User();
		}
		return user;
	}


}
