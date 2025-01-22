package com.neotech.lesson21;

class Constructors {
	//default object creation flow:
			// we say new Constructors()  ---> calls the default constructor 
		Constructors()
		{
			this(5);
			//this() can only be used to call constructors within the same class
			System.out.println("Default Constructor");
		}
		
		//2nd constructor
		Constructors(int x)
		{
			this(5, 6);
			System.out.println("The 2nd Constructor");
		}
		
		//3rd constructor
		Constructors(int x, int y)
		{
			System.out.println("The 3rd Constructor");
		}
		
		
		
		
		public static void main(String[] args) {
		
			Constructors cs1 = new Constructors();
				//default -> 2nd -> 3rd --> Print 3rd --> Print 2nd --> Print Default
			
			Constructors cs2 = new Constructors(5);
				// 2nd -> 3rd --> Print 3rd --> Print 2nd

		}

}
