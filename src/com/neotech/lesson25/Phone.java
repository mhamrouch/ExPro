package com.neotech.lesson25;

public abstract class Phone {
	public void call()
	{
		System.out.println("Phones can make calls!");
	}
	
	public void text() 
	{
		System.out.println("Phones can send texts!");
	}
	
	//unimplemented method (abstract method)
	public abstract void takePicture();
	
	public abstract void playMusic();

}

class iPhone extends Phone
{
	//Override here is a MUST
	@Override
	public void takePicture() {
		System.out.println("iPhones can take good pictures!");
		
	}
	
	//Override here is a MUST
	@Override
	public void playMusic() {
		System.out.println("iPhones can play music!");
		
	}
	
	
	//Override here is optional
	
	public void call()
	{
		System.out.println("iPhones can also make Facetime calls!");
	}

}

//A concrete class cannot have abstract methods!
	//1. I can change the class into abstract class
	//2. I can implement the abstract methods

class Samsung extends Phone
{

	@Override
	public void takePicture() {
		System.out.println("Samsung takes best pictures!");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung can play music too!");
	}
	
	public void googlePlay()
	{
		System.out.println("Samsung has google play!");
	}
	
}
