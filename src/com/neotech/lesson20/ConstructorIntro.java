package com.neotech.lesson20;

public class ConstructorIntro {
	
	//When we create a blueprint or template, we plan for defining a generic real world object
		//In this case, we would have 
			//features and actions
		
		//let's define simple features 
		String name;
		int age;
		
		//Java creates a default constructor when we don't provide our own constructor
			//What is used for?
			//It's used for building the object
		
		//How can create constructor?
		//We must follow some rules:
			//1. Must have the same name as the class
			//2. No return type, not even void!
			//3. We can have arguments or no-argument
			//4. It cannot be static
		
		//Let's create something resembles the default constructor
		//A method with no return type and no argument, and must have the same class name
		//Our default constructor
		
		ConstructorIntro()
		{
			System.out.println("I am the default constructor!");
		}


	public static void main(String[] args) {
		//Let's create an object of ConstructorIntro class
				ConstructorIntro con = new ConstructorIntro();
				
				//If we try to display the features directly after instantiation, 
				//we get nulls and 0's
				
				System.out.println(con.name);
				System.out.println(con.age);
				
				//What do we usually do?
				//Assign values to instance variables --> this is not a very good practice
				
				con.name = "Malik";
				con.age = 42;
				
				System.out.println(con.name);
				System.out.println(con.age);
	

	}

}
