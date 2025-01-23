package com.neotech.lesson25;

public class DrivableTest {

	public static void main(String[] args) {
		//We cannot instantiate an interface --> it's incomplete
//		Drivable d1 = new Drivable();
		
		Drivable d2 = new Cars();  //up-casting
		d2.drive();
//		d2.stop() //Not accessible here
		
		//We access to static elements using the name of classes/interfaces
		System.out.println(Drivable.DRIVE_FAST);
		
		Vehicles v1 = new Cars();
		v1.start();
		v1.stop();
		
//		v1.drive(); //does not exist in the Vehicles
	
		//How can we access all methods? Create an instance of Cars directly 
		
		Cars c1 = new Cars();
		c1.start();
		c1.drive();
		c1.stop();
	}

}
