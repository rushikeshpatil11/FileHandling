package com.file.handling;

import java.io.*;
//Writing dada into File by using FileWriter Class
public class CreateFile {
	
	public static void main(String[] args) {
		
		try {
			FileWriter f=new FileWriter("Message.txt");
			f.write("Jay Shriram");
			f.close();
			System.out.println("Content Successfully Wrote");
		}
		catch(IOException e) {
			System.out.println("Error in file handling");
			
		}
	}

}
