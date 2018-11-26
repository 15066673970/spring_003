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
/* �൱��<bean name="user1" class="com.jinan.www.bean.User"></bean>
 * @Service("user1")//service�� ������һ�������ǰѶ���ע�뵽�����У����ǿ������ֲַ��˼��
 * @Controller("user1")//web��
 * @Repository("user1")//dao��
 */		
@Scope(scopeName="singleton")//Ĭ���ǵ���ģʽ
public class User {
	
	private String name;
	@Value(value="20")
	private Integer age;
	//@Autowired //�Զ�װ��
	//���⣺���ƥ��������һ�µĶ��󣬽��޷�ѡ�����ע����һ������
	//@Qualifier("car2")//ʹ��qualifierע����������Զ�װ���Ǹ����͵Ķ���,��Ҫ��autowired���ʹ��
	
	@Resource(name="car")//�ֶ�ע�룬ָ��ע���ĸ����ƵĶ���
	private Car car;
	@PostConstruct	//�ڶ��󱻴��������.init-method
	public void init() {
		System.out.println("��ʼ������");
	}
	@PreDestroy	//������֮ǰ����.destroy-method
	public void destroy() {
		System.out.println("���ٷ���");
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
