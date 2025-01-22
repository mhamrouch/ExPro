package com.neotech.lesson20;

public class ConstructorTypes {
	String name;
	int age;
	
	//Default constructor
		//no return - not even void
		//must have the same the class name
		//no parameters -> 0-argument
	
	ConstructorTypes() 
	{
		System.out.println("I am the default constructor!");
	}
	
	//we can have parameters received by the constructor
	//signature for this constructor: (String)
	ConstructorTypes (String str)
	{
		System.out.println("I am a constructor with a string " + str);
	}
	
	//signature: (int)
	ConstructorTypes (int num)
	{
		System.out.println("I am a constructor with an integer " + num);
	}

	//signature: (double)
	ConstructorTypes (double d)
	{
		System.out.println("I am a constructor with a double " + d);
	}
	
	//signature: (String, int)
	ConstructorTypes(String str, int num)
	{
		System.out.println("I am a constructor with a string " + str + " and an int " + num);
	}
	
	//signature: (String, String)
	ConstructorTypes(String str1, String str2)
	{
		System.out.println("I am a constructor with a string " + str1 + " and another string " + str2);
	}
	public static void main(String[] args) {
		
	//Let's create an object using the default constructor
		
		ConstructorTypes ct1 = new ConstructorTypes();
		System.out.println(ct1.name + " " + ct1.age);
		
		ConstructorTypes ct2 = new ConstructorTypes("Everest");
		
		//Let's create an object using ConstructorTypes(double)
		ConstructorTypes ct3 = new ConstructorTypes(1.5);
		
		ConstructorTypes ct4 = new ConstructorTypes("1.5"); //This will take us to the (String) const
		
		//Let's create an object with ConstructorTypes(String, int)
		ConstructorTypes ct5 = new ConstructorTypes("Malik", 42);
		
//		ConstructorTypes ct6 = new ConstructorTypes("Cadet", "Neotech", 200); //undefined
			
		

	}

}
