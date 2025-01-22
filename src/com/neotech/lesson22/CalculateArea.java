package com.neotech.lesson22;

public class CalculateArea {
	/*Create a class named CalculateArea in which you should create 
	 * three methods (with the same name) that will calculate 
	 * the area (volume) of
	➔ Rectangle
	➔ Square
	➔ Box
	Use a separate class to test your code	
*/	
	
	
	/**
	 * This method displays the area of a rectangle given its two sides
	 * 
	 * @param side1 - length 
	 * @param side2 - width
	 */
	static void area(int side1, int side2)
	{
		System.out.println("The area of the rectangle is: " + side1 * side2);
	}
	
	/**
	 * This method displays the area of a square given its side.
	 * 
	 * @param side
	 */
	static void area(int side)
	{
		System.out.println("The area of the square is: " + side * side);
	}
	
	/**
	 * This method displays the area/volume of a box given its three sides.
	 * 
	 * @param length
	 * @param width
	 * @param height
	 */
	static void area(int length, int width, int height)
	{
		System.out.println("The area/volume of the box is: " + length * width * height);
	}
	
	

}
