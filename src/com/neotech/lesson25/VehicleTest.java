package com.neotech.lesson25;

public class VehicleTest {

	public static void main(String[] args) {
		// We cannot instantiate both Vehicle and Car classes
				// because they are abstract
				//	Vehicle v = new Vehicle("Red");
				// Car c = new Car("Red", "Tesla");
				
				
				Vehicle v1 = new Tesla("Yellow", "Tesla");
				v1.start();
				v1.drive();
				v1.brake();
				v1.stop();
				//display() does not exist in the Vehicle class
				//v1.display();
				
				//How can we access display()?
				//We can downcast the object so that we get it back to Tesla type
				
				Tesla t1 = (Tesla) v1;
				t1.display();
				
				//----------------------
				Toyota toyota1 = new Toyota("Black", "Camry");
				Car toyota2 = new Toyota("Gray", "Rav4");
				Vehicle toyota3 = new Toyota("Blue", "Highlander");
				
				toyota1.start();
				toyota2.start();
				toyota3.start();
				
				Tesla tesla1 = new Tesla("Black", "S");
				Vehicle tesla2 = new Tesla("Red", "3");
				
				tesla1.display();
//				tesla2.display();
				


	}

}
