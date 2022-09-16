package com.file.handling;

import java.io.*;
//Count vovels from file
public class VovelsFromFile {
	
	public static void main(String[] args) {
		
		int i;
		int counta=0;
		int counte=0;
		int counti=0;
		int counto=0;
		int countu=0;
		try {
			FileReader f=new FileReader("Friends.txt");
			while((i=f.read())!=-1) {
				if(i==97)
					counta++;
				if(i==101)
					counte++;
				if(i==105)
					counti++;
				if(i==111)
					counto++;
				if(i==117)
					countu++;
			}
			System.out.println("'a' is Present in file for ===> "+counta);
			System.out.println("'e' is Present in file for ===> "+counte);
			System.out.println("'i' is Present in file for ===> "+counti);
			System.out.println("'o' is Present in file for ===> "+counto);
			System.out.println("'u' is Present in file for ===> "+countu);
		}
		catch(IOException e) {
			System.out.println("Error in File Handling");
		}
	}

}
