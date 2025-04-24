package com.abstraction;


abstract class Animal {
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	abstract void eat()
	;

	abstract void sleep();

	abstract void hunt();
}

abstract class Tiger extends Animal {

	void eat() {
		System.out.println("Tiger is eating");
	}

	void sleep() {
		System.out.println("Tiger is sleeping");

	}

	abstract void hunt();
}

//abstract  class Maritiger extends Tiger { // This is allowed, abstract class is which is declared as abstract and cannot be instantiated, not that it must have abstract methods
class Maritiger extends Tiger {

	void eat() {
		System.out.println("maritiger eats");
	}

	void sleep() {
		System.out.println("Maritiger sleeps");
	}

	void hunt() {
		System.out.println("Maritiger hunts");
	}

}

public class Forest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maritiger m = new Maritiger();
		m.eat();
		m.hunt();
		m.sleep();
	}

}
