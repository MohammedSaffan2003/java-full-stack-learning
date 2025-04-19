package com.msjJava;

//public class Calculator {
//	int a = 0, b = 0;
//	int sum = 0;
//
//	// 1.Method taking no input and returning no output, but printing there itself.
//	void add() {
//		a = 19;
//		b = 20;
//		sum = a + b;
//
//		System.out.println("Sum printing inside add() " + sum);
//	}
//
//	// 2.Method taking no input but returning an output.
//	int add() {
//		sum = a + b;
//		return sum;
//	}
//
//	// 3.Method taking an input and returning no output, but printing there itself.
//	void add(int a, int b) {
//		sum = a + b;
//		System.out.println("Sum printing inside add() " + sum);
//	}
//
//	// 3.Method taking an input and returning no output, but printing there itself.
//	int add(int a, int b) {
//		sum = a + b;
//		System.out.println("Sum printing inside add() " + sum);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int x = 10, y = 89;
//		Calculator c = new Calculator();
//		System.out.println("Main method");
//		// 1st one
//		System.out.println("First type");
//		c.add();
//		// 2nd one
//		System.out.println("Second type");
//		System.out.println("Sum " + c.add());
//		// 3rd one
//		c.add(x, y);
//		// 4th one
//		System.out.println("Sum " + c.add(20, 30));
//
//	}
//
//}
/*
 * However, in Java, method overloading is determined by the method's signature,
 * which includes:
 * 
 * Method name Number and types of parameters The return type is not considered
 * part of the method signature. So, two methods with the same name and same
 * parameter list, regardless of their return type, are considered to have the
 * same signature, which leads to a "duplicate method" error.
 **/

public class Calculator {
	int a = 0, b = 0;
	int sum = 0;

	// Method 1: Taking no input and returning no output, but printing inside the
	// method.
	void add() {
		a = 19;
		b = 20;
		sum = a + b;
		System.out.println("Sum printing inside add() " + sum);
	}

	// Method 2: Taking no input but returning an output (int).
	int getSum() { // Changed method name to avoid duplication
		sum = a + b;
		return sum;
	}

	// Method 3: Taking two integers as input and printing inside the method.
	void add(int a, int b) {
		sum = a + b;
		System.out.println("Sum printing inside add() " + sum);
	}

	// Method 4: Taking two integers as input and returning an integer.
	int addAndReturn(int a, int b) { // Changed method name to avoid duplication
		sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		int x = 10, y = 89;
		Calculator c = new Calculator();
		System.out.println("Main method");

		// 1st one
		System.out.println("First type");
		c.add();

		// 2nd one
		System.out.println("Second type");
		System.out.println("Sum " + c.getSum());

		// 3rd one
		c.add(x, y);

		// 4th one
		System.out.println("Sum " + c.addAndReturn(20, 30));
	}
}
