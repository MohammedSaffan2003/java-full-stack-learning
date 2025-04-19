package com.msjJava;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Enter element for index " + i);
//			arr[i] = sc.nextInt();
//		}
//		System.out.printf("Array elements are: ");
//		System.out.print("[");
//		for (int i = 0; i < 5; i++) {
//			System.out.print(arr[i]);
//			if (i < 4) {
//				System.out.print(", ");
//			}
//		}

//		for (int i = 0; i < 5; i++)
//			System.out.printf("%d, ", arr[i]);
//		System.out.print('\b');

//		System.out.printf("]");

		// KG children ages
		for (int i = 1; i <= 6; i++) {
			System.out.println("Enter age of child " + i);
			sc.nextInt();
		}
		System.out.println("Children ages with seat numbers are");

		System.out.println("Age\tSeat Number");
		for (int i = 1; i <= 6; i++)
			System.out.println(arr[i] + "\t" + i);

		sc.close();
	}

}
