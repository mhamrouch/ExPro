package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {
		Animals a = new Animals();
		a.name = "Lesi";
		a.color = "Pink";
		a.age = 2;
		a.weight = 20;
	//	a.breed = ""; //Animal does not have this feature
		
		a.eat();
		a.sleep();
		a.displayInfo();
//		a.bark(); //Animal does not have this behavior
		
		
		System.out.println("-------------------");
		
		Dog d = new Dog();
		d.name = "Luna"; //inherited from the parent
		d.color = "Gold";//inherited from the parent
		d.age = 3; //inherited from the parent
		d.weight = 25;//inherited from the parent
		
		d.breed = "Golden"; //Dog specific feature
		
		//inherited from the parent class (Animals) 
		d.eat();
		d.sleep();
		d.displayInfo();
		//Dog specific behavior
		d.bark(); 
		
		
		Cat c = new Cat();
		//All of these are inherited features
		c.name = "Tomato";
		c.color = "Black";
		c.age = 2;
		c.weight = 9;
		
		//cannot access the features or behaviors of Dog class
		//c.breed = "";

		//Inherited from Animals
		c.eat();
		c.sleep();
		c.displayInfo();
		//coming from the Cat class itself
		c.meow();
		
		//cannot access the behaviors of Dog class
		//c.bark();
		
		Puppy p = new Puppy();
		p.age = 1; //all features and behaviors from Animals
		p.breed = "Husky"; //all features and behaviors from Dog class
		p.hasTrainer = true; //it has its own specific features and behaviors as well
		
	}

}
