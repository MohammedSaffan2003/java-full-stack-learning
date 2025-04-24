package com.abstraction;

abstract class Plane {
	abstract void takeOff(); // Abstract methods do not specify a body

	abstract void fly();

	abstract void land();

	void main() {
		System.out.println("HI");
	}

//	default void stub() {	}  //Default methods are allowed only in interfaces.
	static void stub() {
		System.out.println("Static Method is allowed");
	}
}

class CargoPlane extends Plane {
//	abstract class CargoPlane extends Plane {
	// err: The type CargoPlane must implement the inherited abstract method
	// Plane.fly()
	// if not implemented mark the class abstract
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Cargo Plane Flies");
	}

	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Cargo Plane lands");
	}

	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Cargo Plane takes Off");
	}
}

class PassengerPlane extends Plane {
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Passenger Plane flies");

	}

	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Passenger Plane lands");

	}

	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Passenger Plane takes off");

	}
}

class FighterPlane extends Plane {
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Plane flies");

	}

	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Plane lands");

	}

	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Plane takes off");

	}
}

public class AbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//🔹 Abstraction = Hiding internal details and showing only essential features.
//🔹 Abstract class = A class that can't be instantiated and may contain abstract methods.
//🔹 Abstract method = A method with no body; implemented by subclasses.
//🔹 A class extending an abstract class MUST implement all abstract methods (unless it is also abstract).
//🔹 Abstract classes can have constructors, static methods, and non-abstract methods too.
//🔹 Unlike interfaces, abstract classes support fields, constructors, and access modifiers.
