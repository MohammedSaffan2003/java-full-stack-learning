package com.a;
/*
 * Bank has made mandate to open an account using aadhaar card. this decision of
 * bank has created has issue for its customer. You being an object orientors,
 * try to resolve this issue, by creating polymorphic code
 */

import java.util.Scanner;

class IdProof {
	boolean isValid(int num) {
		if (num > 0)
//			System.out.println("Valid ID");
			return true;
		else
//			System.out.println("Invlaid ID");
			return false;

	}
}

class Aadhaar extends IdProof {
	@Override
	boolean isValid(int num) {
		if (num > 0 && num < 200)
//			System.out.println("Valid Aadhaar");
			return true;

		else
//			System.out.println("Invalid Aadhaar");
			return false;

	}
}

class VoterID extends IdProof {

	@Override
	boolean isValid(int num) {
		if (num > 200 && num < 300)
//			System.out.println("Vlaid voter");
			return true;

		else
//			System.out.println("Invalid voter");
			return false;

	}
}

class PanCard extends IdProof {
	@Override
	boolean isValid(int num) {
		if (num > 300 && num < 400)
//			System.out.println("Vlaid PanCard");
			return true;

		else
//			System.out.println("Invalid PanCard");
			return false;

	}
}

public class BankOfInia {
	void createAcc(IdProof id, int num) {
		if (id.isValid(num))
			System.out.println("Account Created");
		else
			System.out.println("Invalid Aadhaar ID ");

	}

	void eKYC(IdProof id, int num) {
		if (id.isValid(num))
			System.out.println("KYC completed");
		else
			System.out.println("Invalid Voter ID ");

	}

	void generateTax(IdProof id, int num) {
		if (id.isValid(num))
			System.out.println("Tax File generated");
		else
			System.out.println("Invalid PAN ID ");
	}

	public static void main(String[] args) {

		IdProof id = null;
		BankOfInia bank = new BankOfInia();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1-> Open Account [Aadhaar number]\n2-> To perform e-KYC [Voter ID]\n3-> Generate Tax file [PAN number]");
		int option = sc.nextInt();
		System.out.println("Enter your ID number ");
		int num = sc.nextInt();
		switch (option) {
		case 1:
			id = new Aadhaar();
			bank.createAcc(id, num);
			break;
		case 2:
			id = new VoterID();
			bank.eKYC(id, num);
			break;
		case 3:
			id = new PanCard();
			bank.generateTax(id, num);
			break;
		default:
			System.out.println("Invalid option!");
			break;
		}
		sc.close();

	}

}

/*
 * 🧠 How Polymorphism Works (Runtime Perspective) When Java code is compiled,
 * the compiler checks for method existence using the reference type. It ensures
 * that the method being called is valid for that type, but it doesn't lock in
 * the method implementation yet. The actual method that gets executed is
 * determined at runtime, based on the actual object (not the reference type)
 * stored in memory. This behavior is powered by Java’s method table (vtable)
 * mechanism. Each class has a table of method pointers, and when an object is
 * created, its class's vtable is used to resolve overridden methods
 * dynamically.
 * 
 * ⚙️ How Dynamic Method Dispatch Works When you call a method on an object
 * using a superclass reference (SuperClass ref = new SubClass();), the JVM
 * looks at the runtime type of the object (SubClass) to decide which version of
 * the overridden method to call. This process is handled internally using
 * dynamic binding. At runtime, the JVM uses the vtable to find the correct
 * method in the subclass, even though the reference is of the superclass type.
 * This is what allows Java to invoke subclass behavior without knowing the
 * exact type at compile time.
 */
// ---------------------------------------------------------------------------------------
/*
 * 📌 Polymorphic Code (Polymorphism in Java) Definition: Polymorphism allows
 * one interface to be used for a general class of actions. It enables one
 * object to take many forms.
 * 
 * Types:
 * 
 * Compile-time Polymorphism (Method Overloading):
 * 
 * Same method name, different parameters.
 * 
 * Resolved during compilation.
 * 
 * Runtime Polymorphism (Method Overriding):
 * 
 * Subclass provides a specific implementation of a method defined in the
 * superclass.
 * 
 * Resolved at runtime.
 * 
 * Benefits:
 * 
 * Code reusability and scalability.
 * 
 * Easier maintenance and extension.
 * 
 * Supports clean and flexible architecture (e.g., using interfaces).
 * 
 * 📌 Dynamic Method Dispatch Definition: A mechanism by which a call to an
 * overridden method is resolved at runtime rather than compile-time.
 * 
 * Key Points:
 * 
 * Occurs when a superclass reference is used to refer to a subclass object.
 * 
 * Java uses the actual object's method (not the reference type's) at runtime.
 * 
 * Example:
 * 
 * java Copy Edit class Animal { void sound() {
 * System.out.println("Animal sound"); } }
 * 
 * class Dog extends Animal { void sound() { System.out.println("Dog barks"); }
 * }
 * 
 * public class Main { public static void main(String[] args) { Animal a = new
 * Dog(); // superclass reference to subclass object a.sound(); // Output: Dog
 * barks } } Why it matters:
 * 
 * It’s how Java supports runtime polymorphism.
 * 
 * Enables flexible and extensible code via method overriding.
 */