package com.javasession;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 30, b = 20;
//		if (a > b)
//			System.out.println("A > B");
//		else
//			System.out.println("B > A");

		// vote eligibility
		int age = 60;
		if (age >= 18)
			System.out.println("Go vote");
		else System.out.println("Come after "+(18-age)+" years");

		// check +ve to -ve
		int num = -3;
		if (num < 0)
			System.out.println("Negative");
		else
			System.out.println("Positive");

		// Even or Odd
		if (num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");

		// Senior citizen
		if (age < 60)
			System.out.println("Young man");
		else
			System.out.println("Old man - i mean Senior citizen");

		// State selection
		String state = "Not Selected";
		state = "Karnataka";
		state = "Tamil Nadu";
		if (state.equals("Karnataka")) {
			System.out.println("Bangalore");
		} else if (state.equals("Andhra")) {
			System.out.println("Amaravathi");
		} else if (state.equals("Tamil Nadu")) {
			System.out.println("Chennai");
		} else {
			System.out.println("No City");
		}
	}

}
