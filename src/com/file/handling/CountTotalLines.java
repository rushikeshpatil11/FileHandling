package com.file.handling;

import java.io.*;

//Count total lines From File
public class CountTotalLines {
	
	public static void main(String[] args) {
		
		int i;
		int count=0;
		
		try {
			FileReader f=new FileReader("Friends.txt");
			while((i=f.read()) != -1) {
				if(i==10)
					count++;
			}
			System.out.println("In this File Total Lines Present are ===> "+count);
		}
		catch(IOException e) {
			System.out.println("Error in File Handling");
		}
	}

}
