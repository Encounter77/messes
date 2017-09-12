package com.ex.Ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Ioc {
	
	@Test
	public void demo01(){
		//����
		UserServiceImpl userservice = new UserServiceImpl();
		userservice.add();
	}
	
	@Test
	public void demo02(){
		//��Spring�����л�ȡ
		//1.���factory(Ĭ��classpath��)
		String xmlPath = "com/ex/Ioc/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2.�������-����new���󣡣���Spring-factory��ȡ����
		UserService userservice = (UserService) applicationContext.getBean("userServiceId");
		userservice.add();
	}
}
