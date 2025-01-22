package com.neotech.lesson23;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.salary = 15000;
		emp.getPaid();
		
		System.out.println("------------------");
		
		Contractor c = new Contractor();
		c.hourlyRate = 60;
		c.getPaid();
		
		System.out.println("------------------");
		
		FullTimeEmployee fte = new FullTimeEmployee();
		fte.salary = 20000;
		fte.getPaid();

	}

}
