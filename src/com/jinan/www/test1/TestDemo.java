package com.jinan.www.test1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jinan.www.bean.User;
//�����Ǵ�������
@RunWith(SpringJUnit4ClassRunner.class)
//ָ����������ʱʹ���ĸ������ļ�
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo {

	//����Ϊuser�Ķ���ע�뵽������
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
