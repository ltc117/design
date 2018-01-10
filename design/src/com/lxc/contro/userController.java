package com.lxc.contro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lxc.dao.UserDao;
import com.lxc.model.User;

public class userController {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao=(UserDao) ctx.getBean("userDao");
		User user=new User();
		
		user.setId(1);
		user.setUsername("lxc");
		user.setPassword("123456");
		userDao.addUser(user);
	}
}
