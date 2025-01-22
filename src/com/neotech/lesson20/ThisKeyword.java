package com.neotech.lesson20;

public class ThisKeyword {
int a, b;
	
	public ThisKeyword() 
	{
		
	}
	ThisKeyword(int a, int b)
	{
		//If we want to assing the local a (parameter) value to the instance variable a
		//we cannot do this process directly by stating a = a
			// a = a mean assigning the value of the local variable a to itself --> doesn't make sense!!
			//To solve this issue, we use this to refer to instance variables
				//this.a --> instance variable a (not the local one)
		this.a = a;
		this.b = b;
		
		//Always check the color --> blue for instance variables
	}
	
	void sum(int a, int b) {
		System.out.println("Sum of the local variables is " + (a+b));
		System.out.println("Sum of the instance variables is " + (this.a+this.b));
		
		//Whenever you have local variable with the same name as instance variables, use this keyowrd
		//to distinguish between them.
		//for locals --> no keyword
		//for instance --> this.instanceVariableName
	}	



}
