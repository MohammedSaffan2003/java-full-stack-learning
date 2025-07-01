package com.exceptions;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection Established ");
		int[] seat = new int[10];
		System.out.println("Enter the seat number to be booked");
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		seat[i - 1] = 20;
//		System.out.printf("Ticket booked for seat number %d\n", i);
		Scanner sc = new Scanner(System.in);
		try {
			int i = sc.nextInt();
			seat[i - 1] = 20;
			System.out.printf("Ticket booked for seat number %d\n", i);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exceptio occured :" + e.getMessage());
//			System.out.println(e.printStackTrace());
//			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Connection closed successfully");			
		}
		sc.close();
	}

}
//@formatter:off
/*
0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 10
	at msjJava/com.exceptions.ArrayIndexOutOfBounds.main(ArrayIndexOutOfBounds.java:14)
*/
//@formatter:on
/*
 * When an exception occurs, the Java Virtual Machine (JVM) creates an exception
 * object and sends it to the Runtime System (RTS). The RTS then checks the call
 * stack (also known as the main stack or activation record) to see if there is
 * any code that can handle the exception.
 * 
 * If no user-defined exception handler (i.e., a try-catch block) is found, the
 * JVM passes the exception to the default exception handler, which typically
 * prints the stack trace and terminates the program.
 * 
 * This is why we catch exceptions using a reference variable (like Exception e)
 * — because the JVM creates and throws an exception object.
 * 
 * 
 */