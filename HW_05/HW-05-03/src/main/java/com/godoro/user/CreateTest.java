package com.godoro.user;

public class CreateTest {

	public static void main(String[] args) throws Exception {
		UserManager userManager=new UserManager();
		User user=new User(507,"Umut Akyurek","umut");
		userManager.create(user);
	}
}
