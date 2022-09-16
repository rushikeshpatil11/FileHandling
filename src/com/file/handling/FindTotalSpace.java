package com.file.handling;

import java.io.*;

public class FindTotalSpace 
{

	public static void main(String[] args) {
		int i;
		int count=0;
		try {
			
			FileReader f=new FileReader("Friends.txt");
			while((i=f.read())!= -1) {
				if(i==32)
					count++;
			}
			System.out.println("Total Space Present in the File is ===> "+count);
		}
		catch(IOException e) {
			System.out.println("Error in file handling");
		}
	}

}
