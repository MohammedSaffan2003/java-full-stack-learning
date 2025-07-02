package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Conection established");
		try {
			// first exception
			System.out.println("Enter a number (numerator)");
			int a = sc.nextInt();
			System.out.println("Enter a number (denomenator)");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("The quotient is " + c);

			// second exception
			System.out.println("Enter size of an array");
			int size = sc.nextInt();
			int[] ar = new int[size];
			System.out.println("The entered array length is " + size);

			// third exception
			System.out.println("Enter an integer");
			int k = sc.nextInt();
			System.out.println("Entered number is " + k);
			ar[size] = k; // for ArrayIndexOutOfBounds

		}
//		catch (Exception e) {
//			// TODO: handle exception
////			System.out.println("An exception occurred due to: " + e.toString().substring(10)); //1st approach
//
//			// 2nd approach
//			String exceptionMessage = e.toString().substring(10);
//			if (exceptionMessage.contains("zero")) {
//				System.out.println("Denominator must be greater than zero");
//			} else if (exceptionMessage.contains("Negative")) {
//				System.out.println("Enter a positive size ");
//			} else if (exceptionMessage.contains("InputMismatch")) {
//				System.out.println("Enter an integer, do not enter any other type");
//			}
//			System.out.println("Please retry in a while");
//		}

		// 3rd approach
		catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("Denominator must be greater than zero");
		}
		catch (NegativeArraySizeException ne) {
			// TODO: handle exception
			System.out.println("Enter a positive size ");
		}
		catch (InputMismatchException ie) {
			// TODO: handle exception
			System.out.println("Enter an integer, do not enter any other type");
		}
		// generic catch block for un-hnadled specific exception that might occur in
		// runtime
		catch (Exception e) {
			// TODO: handle exception
//			System.out.println("An exception occurred due to: " + e.toString().substring(10));
			e.printStackTrace();// prints the whole message
		}
		finally {
			sc.close();
			System.out.println("Connection closed successfully");
		}
	}

}

/*
 * Generic catch block must be at last of all the specific catch block
 * 
 * If Generic is present above all, then what's the point of the specifics below
 */