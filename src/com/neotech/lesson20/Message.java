package com.neotech.lesson20;

public class Message {

	public Message() 
	{
		//this("try me!");
		System.out.println("I am the default constructor!!");
	}
	
	Message(String str)
	{
		this(); //this() here will call the default constructor
		//this() will call a constructor from another constructor
		//you can specify the constructor by its argument list
		
		System.out.println("I am constructor with a string: " + str);
	}

	public static void main(String[] args) {
		
		Message m1 = new Message();
		
		Message m2 = new Message("Hello");

	}


}
