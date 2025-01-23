package com.neotech.lesson24;

public class WebDriverTest {

	public static void main(String[] args) {
		//we're using polymorphism (overriding)
				//the browser called depends on the object created
				//but for each one of them, the correct/respective overriding method is called
				
				WebDriver driver = new FirefoxDriver();
				driver.openBrowser(); //overriding
				//Go to this page
				//Login
				//Save the Result
				
				
	}

}
