package com.neotech.lesson21;

public class PianoTeacher extends Teacher {
	
	
boolean ownsPiano;
	
	public void playsPiano() {
		System.out.println(name + " plays the piano very well");
		if(ownsPiano) {
			System.out.println(name + " owns a piano");
		}
		else {
			System.out.println(name + " does not own a piano");
		}
	}

	public static void main(String[] args) {
		
		PianoTeacher pt = new PianoTeacher();
		pt.name = "Linda";
		pt.gender = 'F';
		//pt.ownsPiano = true;
		//by default it false
		pt.yearsOfExperience = 5;
		
		pt.teaches();
		pt.playsPiano();

	}


}
