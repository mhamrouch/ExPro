package com.neotech.lesson21;

public class MathTeacher extends Teacher {
boolean goodWithNumber;
	
	public void teachesMath()
	{
		System.out.println(name + " teaches Math!");
	}
	
	
	
	public static void main(String[] args) {
		MathTeacher mt = new MathTeacher();
		
		mt.name = "Neha"; //from the parent class (Teacher)
		mt.goodWithNumber = true; //attribute of the child class (MathTeacher)
		
		mt.teaches(); //from the parent (Teacher)
		mt.teachesMath(); //from the child (MathTeacher)
		
	}
	
	

}
