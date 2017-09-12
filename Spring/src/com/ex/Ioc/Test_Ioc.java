package com.ex.Ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Ioc {
	
	@Test
	public void demo01(){
		//常规
		UserServiceImpl userservice = new UserServiceImpl();
		userservice.add();
	}
	
	@Test
	public void demo02(){
		//从Spring容器中获取
		//1.获得factory(默认classpath下)
		String xmlPath = "com/ex/Ioc/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2.获得内容-不是new对象！！从Spring-factory里取对象
		UserService userservice = (UserService) applicationContext.getBean("userServiceId");
		userservice.add();
	}
}
