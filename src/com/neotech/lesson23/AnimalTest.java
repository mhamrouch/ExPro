package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {
		Animal obj1 = new Animal();
		obj1.eat();
		obj1.sleep();
		
//		obj1.run(); //This is Tiger method, we cannot access to it here
		
		Tiger obj2 = new Tiger();
		obj2.eat();
		obj2.sleep();
		obj2.run();
		
		//Casting
		//Recall
		int i = 10;
		double d = i;
		
		//There are two parts to instantiate
			//new Tiger() --> creates a new tiger object
		
		//Can we assign the tiger object to Animal Type?
			//Yes! --> Widenning
		
		Animal obj3 = new Tiger();
		obj3.eat();		//it will determine the method
						//during the run time
		obj3.sleep();
//		obj3.run() //compile time error
		
		//We are casting a Tiger object as an Animal object
		//So, we can see/access all the methods that are defined
		//on the Animal class. 
		//But if we have an overriding method in the Tiger class
		//that takes priority on Runtime
		
		//Can we downcast?
		//Yes
//		Tiger obj4 = (Tiger) new Animal();
			//This process is not safe!

		
		//obj3 --> it is of Animal type, but I know that it is
			//a Tiger acting as an Animal
		
		Tiger obj4 = (Tiger) obj3;
		obj4.eat();
		obj4.sleep();
		obj4.run();
	}

}
