package com.neotech.lesson23;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s = new Shape(10);
//		s.calculateArea(); //This is undefined for Shape
		
		Circle c1 = new Circle(10);
		
		//Why cannot we do this:
		//Circle c2 = new Circle();
		//simply because we didn't create a modified
		//default const
		
		c1.calculateArea();
		
		Circle c3 = new Circle(5);
		c3.calculateArea();
		

	}

}
