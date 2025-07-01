package com.exceptions;

import java.util.Scanner;

public class NegativeArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection established");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter size is " + size);
		System.out.println("Connection closed successfully");
		sc.close();
	}

}
//@formatter:off
/*
-1
Exception in thread "main" java.lang.NegativeArraySizeException: -1
	at msjJava/com.exceptions.NegativeArraySize.main(NegativeArraySize.java:12)
 * */
//@formatter:on