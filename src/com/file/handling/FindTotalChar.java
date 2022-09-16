package com.file.handling;

import java.io.*;
//Find total character present in file
public class FindTotalChar {

	public static void main(String[] args) {

		int i;
		int count = 0;
		try {
			FileReader f = new FileReader("Friends.txt");
			while ((i = f.read()) > -1) {
				count++;
			}
			System.out.println("In this File Total character present is ==>" + count);
		} catch (IOException e) {
			System.out.println("Error in file Handling");
		}
	}
}
