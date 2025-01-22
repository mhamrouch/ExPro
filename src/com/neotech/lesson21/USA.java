package com.neotech.lesson21;

public class USA {
	//instance variables
	
		String state, stateCapital;	

		public USA(String state, String stateCapital) {
			this.state = state;
			this.stateCapital = stateCapital;
		}


		
		public void displayState()
		{
			System.out.println(state);
		}
		
		static void displayInfo()
		{
			System.out.println("This class has two parameters: State and State Capital");
		}

		
		public void displayStateCapital()
		{
			System.out.println(stateCapital);
		}
		
		public void displayInfo2()
		{
			this.displayState(); //I used this. to call a method 
			displayStateCapital(); //I can use this. even though I do not have to. 
						//the compiler will already know which method I am referring to 
		}
		

		public static void main(String[] args) {

			
			USA us1 = new USA("NY", "Albany"); //Why can't I do this???

			us1.displayState();
			us1.displayStateCapital();
			
			us1.displayInfo2();
			
			
			displayInfo(); //it belongs to the class - can be called without any object
			
			
			
		}

}
