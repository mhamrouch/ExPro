package com.neotech.lesson25;

public class FileTest {

	public static void main(String[] args) {
		
		//This is not possible 
//		File f = new File();
		
		File java = new JavaFile();
		File pdf = new PdfFile();
		
		//Can we put these two objects in an array?
		//1s way
		File[] fileArray = {java, pdf};
		
		//2nd way
		File[] fileArray2 = {new JavaFile(), new PdfFile(),
							new WordFile(), new JavaFile()};
		
		for (File f : fileArray2)
		{
			f.open();
			f.edit();
			f.close();
		}

	}

}
