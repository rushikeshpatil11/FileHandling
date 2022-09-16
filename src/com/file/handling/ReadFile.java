package com.file.handling;
//Reading data from file by using FileReader Class
import java.io.*;

public class ReadFile {
	
	public static void main(String[] args) {
		
		try {
			FileReader f=new FileReader("Friends.txt");
			int i;
			while((i=f.read())!=-1) 
				System.out.print((char)i);
			
		}
		catch(IOException e) {
			System.out.println("Error in file handling");
		}
		
	}

}
