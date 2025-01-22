package com.neotech.lesson20;

public class Car {
	String make, model;
	int year;
	
	//default constructor
	Car()
	{
		System.out.println("I am the default constructor");
	}
	
	Car(String carMake, String carModel, int carYear)
	{
		make = carMake;
		model = carModel;
		year = carYear;
	}
	
	void printDetails()
	{
		System.out.println("I have a " + year + " " + make + " " + 
	                             model + " and it runs great!");
	}
	
	
}
