package com.neotech.lesson25;

public abstract class File {
	/*
	 * Create a class File that will have the following behaviors: open(), edit(), close()
	 * edit() and close() are implemented methods while open() is abstract.
	 * 
	 * Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide 
	 * specific implementation of open() behavior.
	 */

	
	public abstract void open();
	
	public void edit()
	{
		System.out.println("File can be edited!");
	}
	
	public void close() 
	{
		System.out.println("Close the file");
	}

}

class JavaFile extends File
{

	public void open() 
	{
		System.out.println("To open a Java file, you need an editor");
	}
	
}

class PdfFile extends File
{

	@Override
	public void open() {
		System.out.println("To open a PDF file you need Foxit Reader");
		
	}
	
}

class WordFile extends File 
{
	public void open()
	{
		System.out.println("To open a Word file, you need MS Word");
	}

}
