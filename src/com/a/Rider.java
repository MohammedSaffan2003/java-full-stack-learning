package com.a;

class Bike {
	void start() {
		System.out.println("Bike Started ");
	}

	void changeGear() {
		System.out.println("Bike Gear Chnaged");
	}

	void accelerate() {
		System.out.println("Bike Accelerates");
	}

	void apply() {
		System.out.println("Bike Applies Brake");
	}

}

class Splender extends Bike {
	void carries2peopel() {
		System.out.println("Splender Carries");
	}

	@Override
	void accelerate() {
		System.out.println("Splender accelerates ");
	}
}

class Activa extends Bike {
	void carriesFamily() {
		System.out.println("Activa carries");
	}

	@Override
	void accelerate() {
		System.out.println("Activa accelerates ");
	}
}

class R15 extends Bike {
	void carries1person() {
		System.out.println("R15 carries ");
	}

	@Override
	void accelerate() {
		System.out.println("R15 accelerates ");
	}
}

public class Rider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Splender s = new Splender();
//		Activa a = new Activa();
//		R15 r = new R15();
		System.out.println("Splender Object");
		s.start();
		s.apply();
		s.changeGear();
		s.carries2peopel();
		s.accelerate();

		System.out.println();

//		System.out.println();
		// Upcasting: Assigning a subclass object (Splender) to a superclass reference
		// (Bike).
		// This allows the superclass reference to point to the subclass object.
		Bike b = s; // Upcasting
		// Calling methods from the superclass (Bike) using the upcasted reference.
		// These methods are inherited from the Bike class.
		b.start();
		b.apply();
		b.changeGear();
		b.accelerate();
		// Downcasting: Converting the superclass reference (Bike) back to the subclass
		// reference (Splender).
		// This enables access to subclass-specific methods not present in the
		// superclass.
		((Splender) b).carries2peopel(); // Downcasting
		// Calling the overridden method from the subclass (Splender) using the
		// downcasted reference.
		// This demonstrates runtime polymorphism, where the method in the subclass is
		// invoked.
		((Splender) b).accelerate();

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

/*
 * Child c = new Parent();
 * 
 * ​No, you cannot downcast a parent class reference to a child class reference
 * directly like this: Child c = new Parent();. This will result in a
 * compile-time error because a parent class reference cannot refer to a child
 * class object.​
 * 
 * Why This Is Not Allowed:
 * 
 * In Java, a parent class reference can refer to a child class object
 * (upcasting), but not the other way around without explicit casting. However,
 * even with explicit casting, downcasting is only valid if the actual object is
 * of the target type. If the object is not of the target type, a
 * ClassCastException will be thrown at runtime.​
 * 
 * Correct Usage of Downcasting:
 * 
 * To downcast, you must first ensure that the object being referred to is
 * actually an instance of the target class or its subclass. This can be done
 * using the instanceof operator to check the object's type before casting.​
 * 
 * 
 * Example:
 * 
 * java Copy Edit Parent p = new Child(); // Upcasting if (p instanceof Child) {
 * Child c = (Child) p; // Downcasting // Now you can access Child-specific
 * methods } else {
 * System.out.println("The object is not an instance of Child."); } This
 * approach ensures type safety and prevents ClassCastException at runtime.​
 * 
 * Summary:
 * 
 * Upcasting: Assigning a child class object to a parent class reference. This
 * is safe and done implicitly.
 * 
 * Downcasting: Assigning a parent class reference back to a child class
 * reference. This requires explicit casting and should be done carefully to
 * avoid runtime exceptions.
 */
