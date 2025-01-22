package com.neotech.lesson21;

public class Student {
	/* Write program as a Student class that has instance variables name and address. 
	 * Create a constructor that will initialize those variables. 
	 * Print name & address of given student using displayInfo method.
	 */
	 
	String name, address;
	
	
	//What is a constructor???
		// 1. its a special method which has the same name as the class
		// 2. it does not have a return type
		// 3. it cannot be static
	 	// 4. we can pass parameters and also define access modifiers
	
	//this is the same constructor as the Java default constructor
	//it does nothing 
	Student()
	{
		
	}
	
	//this is a parametrized constructor
	Student(String name)
	{
		this.name = name;
	}
	
	
	//this is another parametrized constructor - this accepts two parameters
	Student(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	
	
	
	public void displayInfo()
	{
		//using this here is not mandatory, because java will understand I am referring to the 
		//instance variable 
		//but it is a good practice to use, because it immediately tells that this is an instance variable
		System.out.println("Name: " + this.name + "\nAddress: " + this.address);

	}
	
		

}
