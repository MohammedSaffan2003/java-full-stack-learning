package com.a;

class Parent {
	void eat() {
		System.out.println("Parent eats");
	}

	void run() {
		System.out.println("Parent runs");
	}

}

class Child extends Parent {
	void run() {
		System.out.println("Child runs");
	}

	void code() {
		System.out.println("Child can code");
	}
}

public class ClassTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		// Upcasting: Assigning a subclass object (Child) to a superclass reference
		// (Parent).
		// This allows the superclass reference to point to the subclass object.
		Parent p = c; // Upcasting
		// Calling methods from the superclass (Parent) using the upcasted reference.
		// These methods are inherited from the Parent class.
		p.eat(); // Outputs: Parent eats
		p.run(); // Outputs: Child runs (due to method overriding)
		// Downcasting: Converting the superclass reference (Parent) back to the
		// subclass reference (Child).
		// This enables access to subclass-specific methods not present in the
		// superclass.
		((Child) p).code(); // Downcasting

		// Calling the subclass-specific method using the downcasted reference.
		// This demonstrates access to methods unique to the Child class.
		((Child) p).code(); // Outputs: Child can code

		float f = 34.2323f;
		System.out.println("Float " + f);
//		int a = (int) f;
		f = (int) f;
//		System.out.println("Type casted " + a);
		System.out.println("Float " + f);

	}

}

/*
 * Key Points:
 * 
 * Upcasting is the process of converting a subclass reference to a superclass
 * reference. It is done automatically and allows access to superclass methods.
 * However, subclass-specific methods are not accessible through the superclass
 * reference.
 * 
 * Downcasting is the process of converting a superclass reference back to a
 * subclass reference. It requires an explicit cast and allows access to
 * subclass-specific methods. However, if the object is not actually an instance
 * of the subclass, a ClassCastException will be thrown.
 */
