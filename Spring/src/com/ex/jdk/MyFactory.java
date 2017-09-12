package com.ex.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyFactory {
	public static UserService createService(){
		final UserService userService = new UserServiceImpl();
		final MyAspect myAspect = new MyAspect();
		UserService proxService = (UserService)Proxy.newProxyInstance(
								MyFactory.class.getClassLoader(),
								userService.getClass().getInterfaces(),
								new InvocationHandler() {
									
									@Override
									public Object invoke(Object proxy, Method method, Object[] args)
											throws Throwable {
										//ǰ����
										myAspect.before();
										//Ŀ���෽��
										Object obj = method.invoke(userService, args);
										//�󷽷�
										myAspect.after();
										return obj;
									}
								});
		return proxService;
	}
}
