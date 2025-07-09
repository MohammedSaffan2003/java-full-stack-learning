package com.multithreading;

import java.util.Scanner;

public class MultiProcess { // without efficiency
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a value ");
		int a = scan.nextInt();
		System.out.println("enter b value");
		int b = scan.nextInt();
		int c = a + b;
		System.out.println(c);
		for (int k = 65; k <= 75; k++) {

			System.out.println((char) k);
			Thread.sleep(3000);
		}
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
			Thread.sleep(1000);
		}
		scan.close();
	}

}