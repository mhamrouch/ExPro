package com.neotech.lesson24;

public class WebDriver {
	public void openBrowser()
	{
		System.out.println("Open Browser!");
	}
	
}


class ChromeDriver extends WebDriver
{
	public void openBrowser()
	{
		System.out.println("Open CHROME Browser!");
	}
}

class FirefoxDriver extends WebDriver
{
	public void openBrowser()
	{
		System.out.println("Open FIREFOX Browser!");
	}
}

class EdgeDriver extends WebDriver
{

	@Override
	public void openBrowser() {
		System.out.println("Open EDGE Browser!");
	}

}
