package com.neotech.lesson20;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		obj.sum(10, 15);
		
		ThisKeyword obj1 = new ThisKeyword(10, 15);	
		obj1.sum(5, 8);
	}

}
