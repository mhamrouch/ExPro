package com.neotech.lesson22;

public class AdditionTest {

	public static void main(String[] args) {
Addition obj = new Addition();
		
		obj.add(6, 4);
		obj.add(0.5, 0.1);
		
		obj.add(10, 20, 30);
		
		obj.add(10.5, 20.0, 30.0);
		
		obj.add("May", 100);
		obj.add(100, "May");


	}

}
