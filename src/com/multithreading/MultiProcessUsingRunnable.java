package com.multithreading;

import java.util.Scanner;

// 9 July 2025
//continue after TablesThreadsByRunnableImpl
class RunPrintCharThread implements Runnable {
	public void run() {
		System.out.println("Entered PrintChar " + Thread.currentThread());
		for (int k = 65; k < 91; k++) {
//			if (k == 70) {
//				System.out.println("Exited through stop()");
//				this.stop();
//			}
			System.out.println((char) k);
			try {
				Thread.sleep(1000);
//				System.exit(0); //one of the ways to interrupt the Thread -- others might be due to environment failure
			} catch (InterruptedException ie) {
				// TODO: handle exception
				System.out.println(ie.getMessage());
			}
		}
		System.out.println("Exited PrintChar " + Thread.currentThread());
	}
}

class RunPrintNumbers implements Runnable {
	public void run() {
		System.out.println("Enter PrintNumbers " + Thread.currentThread());
		for (int i = 0; i < 10; i++)
			System.out.println(i + 1);
		System.out.println("Exited PrintNumbers " + Thread.currentThread());
	}
}

class RunAddThread implements Runnable {
	public void run() {
		System.out.println("Enter AddThread " + Thread.currentThread());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first interger ");
		int a = sc.nextInt();
		System.out.println("Enter second interger ");
		int b = sc.nextInt();
		System.out.println("Addition of " + a + " + " + b + " is " + (a + b));
		sc.close();
		System.out.println("Exited AddThread " + Thread.currentThread());

	}
}

public class MultiProcessUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started main thread");
		Thread pct = new Thread(new RunPrintCharThread());
		Thread at = new Thread(new RunAddThread());
		Thread pn = new Thread(new RunPrintNumbers());
		pct.start();
		at.start();
		pn.start();
	}

}
//next thing you might want to learn is Concurrency package - ExecutorService