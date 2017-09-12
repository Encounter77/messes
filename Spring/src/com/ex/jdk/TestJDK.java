package com.ex.jdk;

import org.junit.Test;

public class TestJDK {
	
	@Test
	public void demo(){
		UserService userService = MyFactory.createService();
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
	}
}
