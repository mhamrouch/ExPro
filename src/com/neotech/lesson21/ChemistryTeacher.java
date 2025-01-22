package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher {
	
   boolean teachesApChemistry;
	
	public void doesExperiments()
	{
		System.out.println(name + " does experiments!");
	}
	 public static void main(String[] args) {
		 
		 
		 ChemistryTeacher ct = new ChemistryTeacher();
			
			ct.name = "Iana"; //from the parent class (Teacher)
			ct.teachesApChemistry = true; //from the child class (ChemistryTeacher)
			
			
			
			ct.teaches();
			ct.doesExperiments();		
		
	}

}
