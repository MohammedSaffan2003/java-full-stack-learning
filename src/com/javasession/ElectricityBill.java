package com.javasession;

public class ElectricityBill {

	public static void main(String[] uni) {

		// TODO Auto-generated method stub
		int units = 350;
		int bill = 0;
		if (units <= 100) {
			System.out.println("No fees");

		} else if (units > 100 && units <= 200) {
			bill = (units - 100) * 5;
			System.out.println("Bill " + bill);
		} else if (units > 200) {
			bill = (100 * 5) + ((units - 200) * 10);
			System.out.println(bill);
		}

//		if (consumed >= 200)
//			bill = consumed * 10;
//		else
//			bill = consumed * 5;
//		System.out.println("The bill for " + (consumed + 100) + " units is " + bill);

	}

}