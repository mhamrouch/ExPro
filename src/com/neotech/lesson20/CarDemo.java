package com.neotech.lesson20;

public class CarDemo {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.make = "Opel";
		c1.model = "Mokka";
		c1.year = 2024;
		
		c1.printDetails();
		
		Car c2 = new Car("Opel", "Mokka", 2024);
		c2.printDetails();
		
		//You can always check the documentation 
		//to get insight on class constructors
//		StringBuilder sb = new StringBuilder();

	}

}
