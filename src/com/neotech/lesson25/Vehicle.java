package com.neotech.lesson25;

public abstract class Vehicle {
	String color;

	Vehicle(String color) 
	{
		this.color = color;
	}
	
	public void drive()
	{
		System.out.println("Vehicle drives!");
	}
	
	public void stop()
	{
		System.out.println("Vehicle stops!");
	}
	
	public abstract void start();
	public abstract void brake();

}

abstract class Car extends Vehicle
{
	String carType;
	
	Car(String color, String carType)
	{
		super(color);
		this.carType = carType;
	}
	
	//can we implement any or both of start() and brake() here? YES, but it is not required
	//This is optional!!!
	public void brake() 
	{
		System.out.println(carType + " have brakes!");
	}
	
	//can we add a new abstract call here? --> look at the class, is it abstract? If yes, then we can!
	public abstract void carDetails();
	
}

class Tesla extends Car
{

	Tesla(String color, String carType) {
		super(color, carType);
	}

	@Override
	public void carDetails() {
		System.out.println("Details: " + carType + " " + color);
		
	}

	@Override
	public void start() {
		System.out.println(carType + " starts remotely!");
		
	}
	
	//Can we add some specific behaviors? YES!!
	public void display()
	{
		System.out.println("We have a " + color + " " + carType);
	}
	
	
}

class Toyota extends Car
{

	Toyota(String color, String carType) {
		super(color, carType);
	}

	@Override
	public void carDetails() {
		System.out.println("Details: " + carType + " " + color);
		
	}

	@Override
	public void start() {
		System.out.println(carType + " has a keyless start!");
		
	}
}
