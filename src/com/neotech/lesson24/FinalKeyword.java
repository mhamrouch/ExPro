package com.neotech.lesson24;
//if we make this class FINAL it means it cannot be extended from anyone!!!
public class FinalKeyword {
	public static String str = "Hello!";

	public static final String str1 = "Bye!";
	
	public static void main(String[] args) {
		str = "Hi!"; //I am reassigning a new value to str
		//str1 = "Goodbye!"; //Compliler Error: Cannot be reassigned!
		
		
		//local variable 
		final String finalStr = "Java is soo much fun!!!";
		//can I change finalStr --> I can't
		
		//finalStr = "Java is not so much fun -- sometimes!";
		
		
	}

	//can I override a final method?  NO
	public final void hello()
	{
		System.out.println("Hello from a final method!!!");
	}
	
	//can I overload a final method?  YES
	public final void hello(String str)
	{
		System.out.println("Hell " + str);
	}
	
	
}


class SubClass extends FinalKeyword
{
	//cannot override a final method
/*	public final void hello()
	{
		
	}
*/
	
	
	public final void hello(int a)
	{
		System.out.println("This is possible -- different signature -- not overriding!");
	}

	

	}


