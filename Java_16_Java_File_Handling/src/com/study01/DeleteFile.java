package com.study01;

import java.io.File;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		File myObj = new File("filename.txt");
		if (myObj.delete()) {
			System.out.println("Delete the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}

}
