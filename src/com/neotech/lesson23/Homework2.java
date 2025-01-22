package com.neotech.lesson23;

public class Homework2 {
	/*
	  Create a class with 3 overloaded static methods.
	  Then call each overloaded methods with specific arguments and observe the results.
	 */
	
	//HW3: Is exactly the same but with private methods
	
//	static void info()
//	{
//		System.out.println("Today is Tuesday");
//	}
	
	private static void info()
	{
		System.out.println("Today is Tuesday");
	}
	
	static void info(String day)
	{
		System.out.println("Today is " + day);
	}
	
	static void info(String day, String month)
	{
		System.out.println("Today is " + day + " and the month is " + month);
	}
	
	public static void main(String[] args) {
		
		info();
		info("Tuesday");
		info("Tuesday", "November");
	}


}
