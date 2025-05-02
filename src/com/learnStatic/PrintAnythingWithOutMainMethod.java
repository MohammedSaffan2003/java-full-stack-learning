package com.learnStatic;

public class PrintAnythingWithOutMainMethod {
	static {
		System.out.println("Static block");
		int a = 10;
		System.out.println("Local var of static block " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
