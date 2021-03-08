package com.study01;

// resources: https://www.w3schools.com/java/java_files_create.asp

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
		File myObj = new File("filename.txt");
		
		try {
			if (myObj.createNewFile()) {	// createNewFile(): This method returns a boolean value.
				System.out.println("File created " + myObj.getName());
			} else {
				System.out.println("File alreay exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		
	}

}
