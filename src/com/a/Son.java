package com.a;

class GrandParent1 extends Object {
	GrandParent1() {
		System.out.println("GrandParent is born");
	}
}
//Single Level inheritance
class Dad extends GrandParent1 {
	Dad() {
		System.out.println("Dad is born");
	}
	void sing() {
		System.out.println("Hindustan");
	}
}

public class Son extends Dad {
	Son() {
		super();
		System.out.println("Son is born");
	}

	@Override
	void sing() {
		System.out.println("Aartic");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son d = new Son();
		d.sing();
	}

}

/*
 * calling constructors through super(), is called class-level constructor
 * chaining this is seen through inheritance // GrandParent is born //Dad is
 * born //Son is born
 * 
 * child class constructor calling immediate parent class constructor is called
 * class-level constructor chaining
 */

/*
 * Real world scenarios
 * 
 * Parent
 * 
 * Height\ Weight\ Eyes\ Hair Color\
 * 
 * Child
 * 
 * Height(Inherited)\ Weight(Inherited)\ Eyes(Overriden)\ Hair Color
 * (Overirden)\ Coding Skills (Specialized methods)\ Football (Specialized
 * methods)\
 */
