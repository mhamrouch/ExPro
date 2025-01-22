package com.neotech.lesson22;

public class Car {
//	Write a Java class called Car. 
//	Specify features and behaviors of the Car class.
//  Create SportsCar and FamilyCar subclasses of the Car class with their 
//	own features and behaviors.
//  Next, create a LuxurySportsCar that will inherit the SportsCar 
//	and also will have its own features and behaviors.
//  Create objects from each class and test them.

	String make, model;
	int year;

	public Car() 
	{
		System.out.println("I am the Car class Constructor");
	}

	Car(String make, String model, int year) 
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}

}

class SportsCar extends Car 
{
	String transmission;
	int speed;
	
	public SportsCar()
	{
		//If I leave this one empty, then the instance variables would get the default values 
											//String -> null, boolean -> false, int -> 0, etc.
		//System.out.println("I am the SportsCar class constructor!!");
		
		//To avoid having default values, we can reroute the execution
		//when this() is called in a constructor, it will take us to another constructor
		//what will happen? You can customize the instance variable values all you want in this case!
		this("MB", "E", 2000, "Automatic", 240);
	}

	SportsCar(String make, String model, int year, String transmission, int speed) 
	{
		
		//How do we initialize parameters?
		//Can we call super() here?
		//super();
		//Can we call this() here? Yes, but to make useful we don't use it here!!
		
//		super(String, String, int) //we are invoking the superclass constructor
		super(make, model, year);
		this.transmission = transmission;
		this.speed = speed;

	}

}

class FamilyCar extends Car 
{
	boolean childLock;
	int seats;
	
	FamilyCar()
	{
		//If we call a parameterized constructor here, that means we want to set the default values
		//In other words, we don't want to use nulls, 0s, etc.
		
		System.out.println("This is the FamilyCar constructor!!");
	}
	
	FamilyCar(String name, String model, int year, boolean childLock, int seats)
	{
		//For superclass features, we use super() to do the process
		super(name, model, year);
		
		this.childLock = childLock;
		this.seats = seats;
	}
}

class LuxurySportsCar extends SportsCar
{
	boolean designerSeats;
	

}
