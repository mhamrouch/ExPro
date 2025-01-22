package com.neotech.lesson22;

public class A {
	// Write program for multilevel inheritance where class A is
		// inherited by B and class B is inherited by class by C.
		
		String name = "A";
		String lastName = "Test";
		
		void method()
		{
			System.out.println("This is a method in class A!");
			//can I display name? Yes!
			System.out.println(name);
			System.out.println(this.name);
//			System.out.println(super.name); //Trying to get name from Object --> doesn't exist --> error
			
			//this is possible, but let's not do it
//			this.method();
//			method();
			
			//but we can do this!
//			super.method();
		}

	}


	class B extends A
	{
		String name = "B";
		
		void method()
		{
			System.out.println("This is a method in class B!!");
			System.out.println(name);	//it's the same as this.name
			System.out.println(super.name);
			super.method();
		}
	}

	class C extends B 
	{
		String name = "C";
		
		void method()
		{
			System.out.println("This is a method in class C!!");
			System.out.println(name);	//it's the same as this.name
			System.out.println(super.name);	//name is coming from the direct parent --> B
			super.method();	//method() is coming from the direct parent --> B
			System.out.println(lastName);
		}
		

}
