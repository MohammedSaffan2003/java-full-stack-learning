package com.msjJava;

public class Encapsulation {
	String name = "     ";
//	int count = 12;
	Long count;

//	public Encapsulation() {
//		System.out.println("The default constructor is invoked");
//	}
//
//	public Encapsulation(String name, int count) {
//		this.name = name;
//		this.count = count;
//	}
	public Encapsulation(String name) {
		// 2nd it calls the constructor with Long arg inside the class
		this(1212121L);
		System.out.println("String constructor");
		this.name = name;

	}

	public Encapsulation(Long count) {
		System.out.println("Long constructor");
		this.count = count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1st call from main -> String arg constructor 
		Encapsulation en = new Encapsulation("MSJ");
		System.out.println(en.name + " " + en.count);
	}

}
