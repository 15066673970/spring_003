package com.jinan.www.test1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jinan.www.bean.User;
//帮我们创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo {

	//将名为user的对象注入到变量中
	@Resource(name="user1")
	private User u;
	
	@Test
	public void fun1() {
		System.out.println(u);
	}
	
	@Test
	public void fun2() {
		System.out.println(u);
	}
	@Test
	public void fun3() {
		System.out.println(u);
	}

}
