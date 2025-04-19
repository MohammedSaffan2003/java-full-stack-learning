package com.a;

class Dog {
	void bark() {
		System.out.println("Mom dog ");
	}
}

class MariDog extends Dog {

	@Override
	void bark() {
		System.out.println("Mari dog ");
	}
}


public class Kennel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MariDog m = new MariDog();
		m.bark();
	}

}
