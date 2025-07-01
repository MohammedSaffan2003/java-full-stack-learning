package com.exceptions;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a");
		int a = sc.nextInt();
		System.out.println("Enter the b");
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("The c value " + c);
		System.out.println("Normal Termination");
		sc.close();
	}

}
//@formatter:off
/*  
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at msjJava/com.exceptions.DivideByZero.main(DivideByZero.java:14)
*/
//@formatter:on