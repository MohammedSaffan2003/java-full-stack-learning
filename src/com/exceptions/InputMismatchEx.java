package com.exceptions;

import java.util.Scanner;

public class InputMismatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection established");
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter a number");
		arr[0] = sc.nextInt();
		int a = sc.nextInt();
		System.out.println("Number strored successfully " + arr[0] + a);
		System.out.println(15.0 / 0); // displays Infinity when float/zero
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception occurred");
		System.out.println("Connection closed successfully");
	}
		sc.close();
	}

}
//formatter:off
/*
 * Exception in thread "main" java.util.InputMismatchException at
 * java.base/java.util.Scanner.throwFor(Scanner.java:939) at
 * java.base/java.util.Scanner.next(Scanner.java:1594) at
 * java.base/java.util.Scanner.nextInt(Scanner.java:2258) at
 * java.base/java.util.Scanner.nextInt(Scanner.java:2212) at
 * msjJava/com.exceptions.InputMismatchEx.main(InputMismatchEx.java:13)
 */
//formatter:on