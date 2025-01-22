package com.neotech.lesson23;

public class Parent {
	Parent() 
	{
		System.out.println("Parent Class Constructor");
	}
	
	private void hello()
	{
		System.out.println("Hello from the parent class");
	}
	
	static void bye()
	{
		System.out.println("Bye from the parent class!");
	}

}

class Child extends Parent
{
	Child()
	{
		System.out.println("Child class constructor");
	}
	
	//If you cannot access a method, then you wont be able to override it
	
	//We are creating a separate private method for the Child class!
	//So, it is not overridden
	private void hello()
	{
		System.out.println("Hello from the child class!");
	}
	
	//The static method here is not overridden
	//it is re-declared 
	static void bye() 
	{
		System.out.println("Bye from the child class!");
	}

}
