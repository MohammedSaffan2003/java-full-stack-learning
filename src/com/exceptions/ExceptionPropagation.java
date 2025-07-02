package com.exceptions;

import java.util.Scanner;

class Alpha {
	void method1() {
		System.out.println("Connection-2 Established");
		Beta b = new Beta();
//		try {
			b.method2();
//		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled in method1");
//		}
		System.out.println("Connection-2 closed");
	}
}

class Beta {
	void method2() {
		System.out.println("Connection-3 Established");
		Gama g = new Gama();
		// if we put try-catch here the previous connection will not be closed
//		try {
		g.method3();
//		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled in method2");
//		}

		System.out.println("Connection-3 closed");
	}
}

class Gama {
	void method3() {
		System.out.println("Connection-4 Established");
		System.out.println("Enter an integer -numerator");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter another integer -denomenator");
		int b = sc.nextInt();
		sc.close();
//		try {
			int c = a / b;
			System.out.println("Quotient is " + c);
//		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is handled in method3");
//		}
		System.out.println("Connection-4 closed");
	}
}

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection-1 Established");
		Alpha a = new Alpha();
		try {
			a.method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled in main method");
		}
		System.out.println("Connection-1 closed");
	}

}
//@formatter:off
/*
 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at msjJava/com.exceptions.Gama.method3(ExceptionPropagation.java:32)
	at msjJava/com.exceptions.Beta.method2(ExceptionPropagation.java:18)
	at msjJava/com.exceptions.Alpha.method1(ExceptionPropagation.java:9)
	at msjJava/com.exceptions.ExceptionPropagation.main(ExceptionPropagation.java:44)

 */
//@formatter:on
/*
 * 
 * Exception Propagation Explanation When an exception occurs in Java and is not
 * handled (no try-catch), it starts propagating up the call stack until it
 * either gets handled or reaches the Java Runtime System (JVM), which then
 * invokes the default exception handler.
 * 
 * Let's look at what happens step by step in your program:
 * 
 * Step-by-step flow (with denominator = 0): main() method starts
 * 
 * Prints: "Connection-1 Established"
 * 
 * Calls: Alpha a = new Alpha(); a.method1();
 * 
 * Inside Alpha.method1()
 * 
 * Prints: "Connection-2 Established"
 * 
 * Calls: b.method2();
 * 
 * Inside Beta.method2()
 * 
 * Prints: "Connection-3 Established"
 * 
 * Calls: g.method3();
 * 
 * Inside Gama.method3()
 * 
 * Prints: "Connection-4 Established"
 * 
 * Takes two inputs: numerator and denominator
 * 
 * If denominator is 0, the line int c = a / b; causes: 👉 ArithmeticException:
 * / by zero
 * 
 * What happens next (exception propagation) Since there's no try-catch in
 * method3(), the exception is not handled there.
 * 
 * So, it bubbles up to the caller: method2() in Beta
 * 
 * method2() also has no try-catch → bubbles up to method1() in Alpha
 * 
 * method1() has no try-catch → bubbles up to main()
 * 
 * main() has no try-catch → reaches Java Runtime System
 * 
 * Then what? Since no method handled the exception, JVM's Default Exception
 * Handler takes over.
 * 
 * It:
 * 
 * Prints the stack trace
 * 
 * Shows the type: java.lang.ArithmeticException: / by zero
 * 
 * Shows the line numbers in the call stack
 * 
 * Terminates the program abruptly
 * 
 * Key Concept: Stack Unwinding Each method call is placed on the call stack.
 * When an exception is thrown and not handled, Java unwinds the stack (removes
 * methods one by one) until it finds a handler or reaches the runtime.
 * 
 * Summary Exception starts in method3() → goes to method2() → then method1() →
 * then main() → then to JVM → handled by default exception handler.
 * 
 * ✅ This is called exception propagation.
 * 
 */