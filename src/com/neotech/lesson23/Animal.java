package com.neotech.lesson23;

public class Animal {
	public void eat() 
	{
		System.out.println("All animals eat!");
	}
	
	public void sleep()
	{
		System.out.println("All animals sleep!");
	}

}

class Tiger extends Animal
{
	public void eat()
	{
		System.out.println("Tigers eat humans!");
	}
	
	public void run()
	{
		System.out.println("Tiger runs very fast!");
	}
}
