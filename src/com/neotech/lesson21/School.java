package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {
		
		//what does this line mean????
		//	new Student(); -- instantiate
		//Create an object using the Student Template!!!!
		
			//using the default constructor
			Student st1 = new Student();
			
			st1.displayInfo();
			
			st1.name = "Joe";
			st1.address = "NYC";
			
			st1.displayInfo();
		
			System.out.println("-------------");
			
			Student st2 = new Student("John");
			
			st2.displayInfo();//what does this print 
			
			st2.address = "CT";
			
			st2.displayInfo();
			
			System.out.println("-------------");
			
			//How does Java tell which constructor we are using???
			//Based on Constructor Signature 
			Student st3 = new Student("Mark", "NJ");
			st3.displayInfo();
			
				
		
		
		
	}

}
