package com.neotech.lesson25;

public interface Drivable {
	
	//Java will automatically add to any instance variable 
	//here public static final
	
	boolean DRIVE_FAST = true;
	
	//This is done by default!!
//	public static final DRIVE_FAST = true;
	
	//All methods in interfaces will be added abstract keyword by default
	
	void drive();

}

abstract class Vehicles
{
	void start()
	{
		System.out.println("Vechiles can start!");
	}
	
	abstract void stop();
}

class Cars extends Vehicles implements Drivable
{

	@Override
	public void drive() {
		System.out.println("Cars can drive!");
	}

	@Override
	void stop() {
		System.out.println("Cars can stop!");
		
	}
	
}


//In Java: a class can inherit another class
		 // an interface can inherit another interface
		// a class can implement interface but cannot inherit an interface
