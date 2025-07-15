package com.msjJava;

class Printer {
	void print(int a) {
		System.out.println("Prints one int " + a);
	}

	void print(float a) {
		System.out.println("Prints one float " + a);
	}

	void print(char a) {
		System.out.println("Prints one char " + a);
	}

	void print(boolean a) {
		System.out.println("Prints one boolean " + a);
	}

	void print(double a) {
		System.out.println("Prints one double " + a);
	}

	void print(double a, float b) {
		System.out.println("Prints one double and one float " + a + " " + b);
	}

	void print(int a, float b) {
		System.out.println("Prints one int and one float " + a + " " + b);
	}

	void print(float a, int b) {
		System.out.println("Prints one float and one int " + a + " " + b);
	}

	void print(char a, int b) {
		System.out.println("Prints one char and one int " + a + " " + b);
	}

	void print(double a, int b, float c) {
		System.out.println("Prints one double, one int and one float " + a + " " + b + " " + c);
	}

	// 1.- The method print(double, float) is ambiguous for the type Printer
	void print(int a, char b) {
		System.out.println("Prints one int and one char " + a + " " + b);
	}

	void print(char a, float b) {
		System.out.println("Prints one char and one float " + a + " " + b);
	}

	// 1.- creating char, char method to overcome the ambiguity
	void print(char a, char b) {
		System.out.println("Prints one char and one char " + a + " " + b);
	}


}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer print = new Printer();
		print.print(false);
		print.print((float) 10, 10); // float, int
		print.print(10, 10f); // int,float
		print.print((char) 1);
		print.print(10.1);
		print.print(10.2, 10);
		print.print(10, 10, 10);
		print.print(10.1, 10, 10f);
		print.print('A', 10);
		print.print('A', 10.1f);
		print.print('X', 'Y');// The method print(double, float) is ambiguous for the type Printer
	}

}
/**
 * to achieve method overloading, we can have different datatypes in parameter >
 * different number of parameter > (if equal)> then change the order of the
 * parameter all with the same method name in one class
 * 
 * here it feels like there is only one method that accepts all types of
 * arguments, but that's not the scenario here, we have separate implementation
 * for each type(s) of arguments -- this is called Virtual Polymorphism
 * 
 * the compiler decides for attach the particular method implementation for each
 * call at compile time, so it is also called Compile time polymorphism
 */

//@formatter:off
/*
 * 📚 Concept: Method Overloading (Compile-Time / Static Polymorphism)
 *
 * 🔹 What is Method Overloading?
 * - Defining multiple methods with the same name in a class but with:
 *   1. Different parameter types
 *   2. Different number of parameters
 *   3. Different parameter **order**
 *
 * 🔸 Why use it?
 * - Improves code readability and flexibility
 * - Enables use of a common method name for related but type-specific logic
 *
 * 🔍 How it works:
 * - The Java compiler decides which method to call at **compile time** based on:
 *   → Argument type
 *   → Number of arguments
 *   → Order of arguments
 * - This is why it’s also known as **Compile-Time Polymorphism**
 *
 * 🧪 Behavior in Code:
 * - `print(int a)`, `print(float a)`, `print(char a)` → single-argument overloads
 * - `print(int a, float b)` vs. `print(float a, int b)` → order matters
 * - `print(char a, char b)` added to resolve **ambiguity**
 *   → Otherwise, something like `print('X', 'Y')` could match multiple overloaded versions via widening (char → int/float/double)
 *
 * ⚠️ Common Pitfall:
 * - Ambiguity can occur when the compiler cannot choose between multiple valid overloads
 *   → e.g., `print('X', 'Y')` without a specific `(char, char)` method would be ambiguous
 *
 * ✅ Key Points:
 * - Overloaded methods must differ in **signature** (parameters), not return type alone
 * - Helps simulate function polymorphism like in C++ or dynamic languages
 * - All overloaded methods reside in the **same class**
 *
 * 💡 Real-world Analogy:
 * - Think of a printer that knows how to print a receipt (int), a picture (float), a letter (char), etc., using the same command — `print()`.
 *   The machine figures out *what* to do based on the type of input.
 */