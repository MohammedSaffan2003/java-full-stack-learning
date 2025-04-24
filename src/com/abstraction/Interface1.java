package com.abstraction;

public interface Interface1 {
	int variable = 1; // The blank final field variable may not have been initialized

	private void privMeth() {

	}

	abstract void abstractMeth(); // Abstract methods do not specify a body

	void MethSignature(); // Abstract methods do not specify a body

//	void Concretemeth() {
//	System.out.println("HI");
//	} //Abstract methods do not specify a body

	default void DefaultMeth() { // This method requires a body instead of a semicolon
		System.out.println("Default Method");
	}

	static void StaticMeth() { // This method requires a body instead of a semicolon
		System.out.println("Static Method ");
	}
}
