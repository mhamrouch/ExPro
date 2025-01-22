package com.neotech.lesson21;

public class Dog extends Animals {
	//dog specific feature
		String breed;
		
		
		//dog specific behavior
		public void bark()
		{
			System.out.println("Only dog barks");
			System.out.println("The breed is: " + breed);
			System.out.println("The name is: " + name);
		}

}
