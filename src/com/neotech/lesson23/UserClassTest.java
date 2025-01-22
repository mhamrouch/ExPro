package com.neotech.lesson23;

public class UserClassTest {

	public static void main(String[] args) {
		//If you would like to create an instance
		//using the default const
		UserClass uc = new UserClass();
		
//		uc.userDetails(); //The parent does not inherit from
							//the child
		System.out.println(uc.name + " " + uc.mobileNumber);
		
		UserInfo user = new UserInfo("Everest", 453688932L, "Boston");
		
		user.userDetails();

	}

}
