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
