package com.multithreading;
//9 July 2025
//continue after WhyRunnableImpIsBetterThanThreadClass
//06 next MultiProcessUsingRunnable

class RunTwoTables implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println("2 x " + i + " = " + 2 * i);
	}
}

class RunThreetables implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println("3 x " + i + " = " + 3 * i);
	}
}
public class TablesThreadsByRunnableImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// My 0
//		RunTwoTables t2 = new RunTwoTables();
//		RunThreetables t3 = new RunThreetables();
//		t2.start(); //1.The method start() is undefined for the type RunTwoTables
//		t3.start();
		// 2.This will give sequential execution
//		t2.run();
//		t3.run();
		// My 0
//		Thread tt2 = new Thread(t2);
//		Thread tt3 = new Thread(t3);
//		tt2.start();
//		tt3.start();

		// 3. The start() pushes the run() method on to the new stack, but the start()
		// is
		// present in Thread class, so we didn't use Thread class, then we need to have
		// a reference of the Thread class to call the start()
		Thread t1 = new Thread(new RunTwoTables());
		Thread t2 = new Thread(new RunThreetables());
		t1.start();
		t2.start();
	}

}
