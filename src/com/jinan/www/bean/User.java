package com.jinan.www.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("user1")
/* 相当于<bean name="user1" class="com.jinan.www.bean.User"></bean>
 * @Service("user1")//service层 ，功能一样，都是把对象注入到容器中，但是可以体现分层的思想
 * @Controller("user1")//web层
 * @Repository("user1")//dao层
 */		
@Scope(scopeName="singleton")//默认是单例模式
public class User {
	
	private String name;
	@Value(value="20")
	private Integer age;
	//@Autowired //自动装配
	//问题：如果匹配多个类型一致的对象，将无法选择具体注入哪一个对象
	//@Qualifier("car2")//使用qualifier注解告诉容器自动装配那个类型的对象,需要和autowired配合使用
	
	@Resource(name="car")//手动注入，指定注入哪个名称的对象
	private Car car;
	@PostConstruct	//在对象被创建后调用.init-method
	public void init() {
		System.out.println("初始化方法");
	}
	@PreDestroy	//在销毁之前调用.destroy-method
	public void destroy() {
		System.out.println("销毁方法");
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	@Value("tom")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}


}
