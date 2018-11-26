package com.jinan.www.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jinan.www.bean.User;

public class TestDemo {

	@Test
	public void fun1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user1 = (User) applicationContext.getBean("user1");
//		User user2 = (User) applicationContext.getBean("user1");
//		System.out.println(user1==user2);
		System.out.println(user1);
		applicationContext.close();
		
	}

}
