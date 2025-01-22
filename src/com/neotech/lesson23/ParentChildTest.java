package com.neotech.lesson23;

public class ParentChildTest {

	public static void main(String[] args) {
		Parent p = new Parent();
//		p.hello(); //private, we cannot access it here
		Parent.bye();
		
		System.out.println("--------------------");
		
		Child c = new Child();
//		c.hello();  //private, we cannot access it here
		Child.bye();

	}

}
