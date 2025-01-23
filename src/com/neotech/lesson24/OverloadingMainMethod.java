package com.neotech.lesson24;

public class OverloadingMainMethod {
	
	//Which method will run??
			//1. By default the public static void main(String[] args) ---> Starting point
			//2. The other main methods here are actually overloading the main method but being 
			//	the code execution starting point is only for this signature: public static void main(String[]) 
		
		
		
		
		public static void main(String[] args)
		{
			System.out.println("I am the MAIN method!!!");
			System.out.println("Call this main method: main(String, String)");
			main("Hello", "Bye");
			
			
			int[] arr = {4,5,6,7};
			main(arr);
			
		}
		
		//Overloading the main method!!!
			// This is polymorphism: compile time
		
		public static void main(String str1, String str2)
		{
			System.out.println("Main method with two String parameters: " + str1 + " and " + str2);
		}
		
		
		public static void main(int[] array)
		{
			System.out.println("I am the main method with an int array parameter");
		}

}
