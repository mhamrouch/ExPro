package com.neotech.lesson24;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard card1 = new CreditCard(5000); //I have to send a balance
		card1.calculateInterest();
		
		
		CreditCard card2 = new AX(7000); //up casting
		card2.calculateInterest();
		
		
		CreditCard card3 = new Visa(15000); //up casting 
		card3.calculateInterest();
	//	card3.cashback(); //Why cant we call it?
			//because card3 is a CreditCard object, so it does not have such method
		
		//if you have to use the cashback(), then you 
		//need to call that from a Visa object
		Visa card4 = new Visa(6000);
		card4.cashback();
		
		
		//What is the purpose of assigning all of these
		//to a CreditCard object??
		
		CreditCard[] cards = {card1, card2, card3, card4, new AX(4000)};
		
		
		for (CreditCard cc : cards)
		{
			cc.calculateInterest();
		}
		
		
		
		

	}

}
