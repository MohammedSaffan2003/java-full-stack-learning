package com.multithreading;
//continue from MyThread 
class TwoTables extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println("2 x " + i + " = " + 2 * i);
	}
}

class Threetables extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println("3 x " + i + " = " + 3 * i);
	}
}
public class MultiThreadsForTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoTables t2 = new TwoTables();
//		t2.multiTwo(); //1. this will only give the sequential execution
		t2.start(); // 2. this will push the method the new stack, but our method but run() - so we
					// rename those to run()
		Threetables t3 = new Threetables();
//		t3.multiThree();
		t3.start();
	}

}
