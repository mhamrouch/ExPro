package com.neotech.lesson23;

public class UserClass {
	/*
	Write program: UserClass that has a constructor that
    initializes instance variables name and mobile number.
    Create a subclass UserInfo that will have user address
    variable and it is also being initialized through constructor
    call. Print users name, mobile number and address in
    userDetails method. Test your code.
	*/
	
	String name;
	long mobileNumber;
	
	//If you want to have a default constructor, then create if
	//you have a parameterized constructor
	
	UserClass()
	{
		
	}
	
	UserClass(String name, long mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

}

class UserInfo extends UserClass
{
	String userAddress;

	UserInfo(String name, long mobilNumber, String userAddress)
	{
//		this.name = name;	//This is possible but not proper!!
		super(name, mobilNumber);
		
		this.userAddress = userAddress;
	}
	
	void userDetails()
	{
		System.out.println("User Details:");
		System.out.println("Name --> " + name);
		System.out.println("Mobile --> " + super.mobileNumber);
		System.out.println("Address --> " + userAddress);
	}
	

}
