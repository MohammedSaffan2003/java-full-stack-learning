package com.multithreading;

//9 july 2025
//continue after MultipleMethInRunMethByThreadClass
class MultipleTables extends Thread {

	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if (name.equals("TWO"))
			printTwoTables();
		else if (name.equals("THREE"))
			printThreeTables();
		else
			printNineTables();
	}

	public void printTwoTables() {
		System.out.println("Enter PrintTwoTables " + Thread.currentThread());
		for (int i = 1; i <= 10; i++)
			System.out.println("2 x " + i + " = " + 2 * i);
		System.out.println("Exited PrintTwoTables " + Thread.currentThread());
	}

	public void printThreeTables() {
		System.out.println("Enter PrintThreeTables " + Thread.currentThread());
		for (int i = 1; i <= 10; i++)
			System.out.println("3 x " + i + " = " + 3 * i);
		System.out.println("Exited PrintThreeTables " + Thread.currentThread());
	}

	public void printNineTables() {
		System.out.println("Enter PrintNineTables " + Thread.currentThread());
		for (int i = 1; i <= 10; i++)
			System.out.println("9 x " + i + " = " + 9 * i);
		System.out.println("Exited PrintNineTables " + Thread.currentThread());
	}

	public void callNineTableMehtod(MultipleTables t9) {
		t9.start();
	}

}
public class MultipleTablesUsingSinglethreadClass {

	static void createNineTableThreadObject() {
		MultipleTables t9 = new MultipleTables();
		t9.callNineTableMehtod(t9);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleTables t2 = new MultipleTables();
		MultipleTables t3 = new MultipleTables();
//		MultipleTables t9 = new MultipleTables(); //3.
		// 3. trying to create the object outside the main method -- i'm trying to see
		// when the method name changes

		// 2.
//		t9.callNineTableMehtod(t9);

		t2.setName("TWO");
		t3.setName("THREE");
//		t9.setName("NINE")//3.;
		// 1.
//		t9.start();
		MultipleTablesUsingSinglethreadClass.createNineTableThreadObject(); // 3.
		t3.start();
		t2.start();
	}

}
