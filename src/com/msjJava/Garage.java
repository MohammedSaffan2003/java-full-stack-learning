package com.msjJava;

class Car {
	String name;
	String cost;

	void showDetails(Car y) {
		y.name = "Maruthi";
		y.cost = "50000";
	}
}

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.name = "BMV";
		c.cost = "20000000";
		System.out.println(c.name);
		System.out.println(c.cost);

		System.out.println("After show detail method");

		c.showDetails(c);
		System.out.println(c.name);
		System.out.println(c.cost);

	}

}
