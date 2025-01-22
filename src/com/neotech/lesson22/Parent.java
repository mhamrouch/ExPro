package com.neotech.lesson22;

public class Parent {
	String name = "Parent Name";
	String lastName = "Parent Lastname";
	
	void hello()
	{
		System.out.println("I am the parent class!!!");
	}

}

class Child extends Parent
{
	String name = "Child Name";
	//String lastName = "Child Lastname";
	
	void display()
	{
		System.out.println(name); //by default Java adds this. keyword in front of name
		System.out.println(this.name); //This is will act exactly as the previous line
		//How about if we want to display the Parent name? --> super
		System.out.println(super.name);
		System.out.println(lastName);
		//can I do this this.lastName? Yes! But with no effect!
		System.out.println(this.lastName);
		//can I do this too? super.lastName? Yes, but also with no effect!!
		System.out.println(super.lastName);
	}
	
	void hello()
	{
		System.out.println("I am the Child class!!");
	}
	
	void sayHello()
	{
		display();	//if not specified, Java inserts this. in front of the method name
		
		hello();    //if not specified, Java inserts this. in front of the method name
		
		//To access hello() of the Parent, we need to add super in front of it
		super.hello();
	}


}
