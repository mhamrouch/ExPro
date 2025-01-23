package com.neotech.lesson24;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("Student Object: Student");

		Student student = new Student();
		student.study();
		student.doHomework();
	//	student.getJob(); //we cannot access child behaviors
		
		
		
		System.out.println("Neotech Object: Neotech");
		
		NeotechStudent neotech = new NeotechStudent();
		neotech.doHomework();  //coming from the Parent class (Student)
		neotech.study();
		neotech.getJob();

		
		System.out.println("Student Objects: Different");
		
		Student s1, s2, s3; //variables of type Student
		
		s1 = new NeotechStudent();  //up-casting
		s2 = new CollegeStudent();	//up-casting
		s3 = new SchoolStudent();	//up-casting
		
		
		s1.study(); //if you hover over the study() you will notice it says it is
					//calling the Student.study(). At runtime this will execute
					//NeotechStudent.study() because we are overriding it 
					//runtime polymorphism!!!!
		s2.study();
		
		

	}

}
