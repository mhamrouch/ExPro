package com.neotech.lesson25;

public class PhoneTest {

	public static void main(String[] args) {
		//Can we instantiate the Phone class?
		//For sure NO!
		//Why? It's abstract --> incomplete
//Phone p1 = new Phone();
//using p1, we can access to any method

Phone iphone = new iPhone(); //upcasting
iphone.call();	//overriding - child method will execute
iphone.text();	//inherited method - parent method will execute
iphone.takePicture(); //implemented method - child method will execute
iphone.playMusic();	  //implemented method - child method will execute

Phone samsung = new Samsung(); //upcasting
samsung.call();
samsung.text();
samsung.takePicture();
samsung.playMusic();

//Can I access googlePlay() here? NO!
//samsung.googlePlay(); //Does not exist in the Phone class!	

	}

}
