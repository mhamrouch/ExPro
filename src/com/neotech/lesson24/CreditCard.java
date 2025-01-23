package com.neotech.lesson24;

public class CreditCard {
	/*
	 * 
	 * ▪ Create a class CreditCard and define two variables, balance and interest. ▪
	 * Create an instance method that will calculate the interest based on the given
	 * balance. ▪ Create 2 subclasses: Visa and AX. In AX class override the method
	 * calculate interest. ▪ Call the method by creating an object of each of the
	 * three classes.
	 * 
	 */

	double balance, interest;

	CreditCard(double balance) {
		this.balance = balance;
	}

	public void calculateInterest() {
		interest = 5;
		System.out.println("The interest rate is " + interest + "%!");
	}

}

class Visa extends CreditCard {
	// forced to call the super constructor
	Visa(double balance) {
		super(balance);
	}

	public void calculateInterest() {
		if (balance < 10000) {
			interest = 15;
		} else {
			interest = 20;
		}
		System.out.println("The VISA interest rate is " + interest + "%!");
	}

	public void cashback() {
		System.out.println("Visa has 3% cashback!");
	}

}



class AX extends CreditCard
{

	AX(double balance) {
		super(balance);
	}

	//@Override  -  is not required
	//1. used for readability - you immediately understand this method overrides some other method
	
	
	@Override
	public void calculateInterest() {

		if (balance < 5000)
		{
			interest = 4.5;
		}
		else
		{
			interest = 7.5;
		}
		System.out.println("The AX interest rate is " + interest + "%!");
	}


	

}
