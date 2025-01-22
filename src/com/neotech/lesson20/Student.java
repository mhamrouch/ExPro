package com.neotech.lesson20;

public class Student {
//	Write a java program of Class Students that takes students name and 3
//	exam scores. 
//	Inside your class also have a method to Calculate Average Score. 
//	Test Student class for 3 different students with different marks. 
//	Your program should print the average mark of each student name.
	
	String name;
	int score1, score2, score3;
	
	//I will create a constructor that initializes the instance variables
	Student(String studentName, int s1, int s2, int s3)
	{
		name = studentName;
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}
	
	int average()
	{
		return (score1 + score2 + score3)/3;
	}
	


	public static void main(String[] args) {
		
//		Student s1 = new Student(); //This is not possible now since we have a parameterized const
		//Once we create any constructor, the default constructor provided by Java will be revoked
		
		Student s1 = new Student("May", 90, 95, 99);
		Student s2 = new Student("Ahmet", 80, 99, 95);
		Student s3 = new Student("Cadet", 99, 98, 97);
		
		System.out.println(s1.name + " has an average of " + s1.average());
		System.out.println(s2.name + " has an average of " + s2.average());
		System.out.println(s3.name + " has an average of " + s3.average());
		
		//Can I change any of the score now? Yes!!
		s2.score1 = 100;
		System.out.println(s2.name + " has an average of " + s2.average());
	}
	
}
