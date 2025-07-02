package com.exceptions;

import java.io.FileInputStream;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file = new File("D:\\MSJ-Java\\checked-exception.txt");
//		System.out.println(file.getName());
//		System.out.println(file.exists());
//		System.out.println(file.length());
		try {
			// compiler checks even before compiling
		FileInputStream fileInput = new FileInputStream("D:\\MSJ-Java\\checked-exception1.txt");
		fileInput.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		}
	}

}

//@formatter:off
/*
java.io.FileNotFoundException: D:\MSJ-Java\checked-exception1.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	at msjJava/com.exceptions.CheckedException.main(CheckedException.java:15)

 */
//@formatter:on