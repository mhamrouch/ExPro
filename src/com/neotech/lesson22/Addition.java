package com.neotech.lesson22;

public class Addition {
	//signature: add(int, int)
		void add(int a, int b)
		{
			System.out.println(a + b);
		}
		
		//signature: add(int, int) --> this is not an overloaded method 
		//it has the same signature!
//		void add(int num1, int num2)
//		{
//			System.out.println(num1 + num2);
//		}
		
		//We can create overloaded methods by changing the data type of parameters
		//signature: add(double , double)
		void add(double a, double b)
		{
			System.out.println(a + b);
		}
		
		//We can create overloaded methods by chaning the number of parameters
		//signature: add(int, int, int)
		void add(int a, int b, int c)
		{
			System.out.println(a + b + c);
		}
		
		void add(double a, double b, double c)
		{
			System.out.println(a + b + c);
		}
		
		void add(double d, int i)
		{
			System.out.println(d + i);
		}
		
		void add(String str, int i)
		{
			System.out.println("Cannot add those, we can concatenate them!");
		}
		
		//overloading by changing the order of parameters -> the order is very important!
		void add(int i, String str) 
		{
			System.out.println("Still cannot add them!!");
		}



}
