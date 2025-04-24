package com.abstraction;

class MyCalci {
	void add() {
		int a = 10, b = 20;
		int c = a + b;
		System.out.println("added " + c);
	}

	void sub() {
		int a = 100, b = 50, c = a - b;
		System.out.println("Subtracted " + c);
	}
}
public class WhyAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalci m = new MyCalci();
		m.add();
		m.sub();
//		m.mul();
		/*
		 * The above two methods cannot be used because the class developer has not
		 * implemented the logic of the rest methods ,that's the reason we must not
		 * allow the instantiation of the class. So we use abstract keyword
		 */
	}

}
