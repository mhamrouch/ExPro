package com.neotech.lesson20;

import java.util.Scanner;

public class RecapHomeWork {
//	Create a method that will accept a String as a parameter and return a new 
//	String that consists only of vowels. The method should be available only inside the 
//	class where it was declared and executed by calling its name.
	
	//Input (parameter): String
	//Output (return type): String 
	//The method is available only within/inside its class: private 
	//Executed by calling its name: a class method or static method
	//Let's decide the method name: getVowels()
	
	private static String getVowels(String str)
	{
		//What do we want to do here?
		//What's method's objective/process
		
		//We need to replace all non-vowel letters in str by "" and return the string
		
		//To do so, we can use replaceAll() and we provide reg ex to do the replace
		//reg ex -> [] --> [^aeiouAEIOU] --> replace anything except for those
		
		String result = str.replaceAll("[^aeiouAEIOU]", "");
		
		return result;
		
		//OR on one line
		//return str.replaceAll("[^aeiouAEIOU]", "");
	}

	public static void main(String[] args) {
		//Let's get a string from the console
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter a text:");
				String text = scan.nextLine();
				
				System.out.println(getVowels(text)); //We are calling the method
													// and getting the returned string
													// and displaying it at the same time	

	}

}
