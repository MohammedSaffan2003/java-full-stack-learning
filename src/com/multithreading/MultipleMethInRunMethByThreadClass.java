package com.multithreading;
//9 July 2025

//continue MultiProcessUsingRunnable
class MultiMethodThreadClass extends Thread {

	public void run() {
//		Thread t = new Thread.currentThread(); //Thread.currentThread cannot be resolved to a type 
		/*
		 * is syntactically incorrect, because:

Thread.currentThread() is a static method, and

You're trying to call it as if Thread were a constructor or an object.
		 */
		Thread t = Thread.currentThread(); // ✅ correct
		String name = t.getName();
//		String name = Thread.currentThread().getName(); //this works
		if (name.equals("CHAR"))
			printChar();
		else if (name.equals("NUMS"))
			printNumbers();
		else
			printTwoTables();
	}

	public void printChar() {
		System.out.println("Entered PrintChar " + Thread.currentThread());
		for (int k = 65; k < 80; k++) {
			System.out.println((char) k);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				// TODO: handle exception
				System.out.println(ie.getMessage());
			}
		}
		System.out.println("Exited PrintChar " + Thread.currentThread());

	}

	public void printNumbers() {
		System.out.println("Enter PrintNumbers " + Thread.currentThread());
		for (int i = 0; i < 10; i++)
			System.out.println(i + 1);
		System.out.println("Exited PrintNumbers " + Thread.currentThread());

	}

	public void printTwoTables() {
		System.out.println("Enter PrintTwoTables " + Thread.currentThread());
		for (int i = 1; i <= 10; i++)
			System.out.println("2 x " + i + " = " + 2 * i);
		System.out.println("Exited PrintTwoTables " + Thread.currentThread());
	}
}
public class MultipleMethInRunMethByThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiMethodThreadClass mmt = new MultiMethodThreadClass();
		MultiMethodThreadClass mmt1 = new MultiMethodThreadClass();
		MultiMethodThreadClass mmt2 = new MultiMethodThreadClass();

		mmt.setName("CHAR");
		mmt1.setName("NUMS");
		mmt2.setName("TAB");

		mmt.start();
		mmt1.start();
		mmt2.start();
	}

}
