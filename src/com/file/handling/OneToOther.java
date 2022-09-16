package com.file.handling;

import java.io.*;

public class OneToOther {

	public static void main(String[] args) {

		int i;
		try {
		FileReader f=new FileReader("Friends.txt");
		i=f.read();
		FileWriter f1=new FileWriter("Friends1.txt");
		f1.write((char)i);
		f1.close();
		System.out.println("File Copy Successfully");
		
		}
		catch(IOException e) {
			System.out.println("Error in File Handling");
		}
	}

}
