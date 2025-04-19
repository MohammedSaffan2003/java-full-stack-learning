package com.msjJava;

//class Student {
//	String name;
//	int roll;
//
//	public Student() {
//		this("MSJ"); // this method call ------- Local constructor chain
//		System.out.println("Inside 0 param constructor"); // last prints first called
//
//	}
//
//	public Student(String name) {
//		this(12343);
//		this.name = name;
//		System.out.println("Inside name constructor"); // 2nd prints 2nd called
//	}
//
//	public Student(int roll) {
//		this.roll = roll;
//		System.out.println("Inside roll constructor"); // 1st prints 3rd called
//	}
//}
//
//public class LocalConstructorChain {
//	public static void main(String args[]) {
//		Student s = new Student();
//		System.out.println(s.name + ' ' + s.roll);
//	}
//
//}

//Changing the order of execution of the local constructor chain
class Student {
	String name;
	int roll;

	public Student() {
		this(12132343); // this method call ------- Local constructor chain
		System.out.println("Inside 0 param constructor");

	}

	public Student(String name) {
		this();
		this.name = name;
		System.out.println("Inside name constructor");
	}

	public Student(int roll) {
		this.roll = roll;
		System.out.println("Inside roll constructor");
	}
}

public class LocalConstructorChain {
	public static void main(String args[]) {
		Student s = new Student("MSJ");
		System.out.println(s.name + ' ' + s.roll);
	}

}

/*
 * Constructor chaining in Java refers to the practice of invoking one
 * constructor from another within the same class or between a subclass and its
 * superclass. This technique promotes code reusability and simplifies object
 * initialization.​
 * 
 * Key Points:
 * 
 * Within the Same Class:
 * 
 * Use the this() keyword to call another constructor in the same class.​
 * 
 * The this() call must be the first statement in the constructor.​
 * 
 * At least one constructor should exist without a this() call to prevent
 * infinite recursion.​
 * 
 * Example:
 * 
 * java Copy public class Person { private String name; private int age;
 * 
 * public Person() { this("Unknown", 0); // Default constructor chaining }
 * 
 * public Person(String name) { this(name, 0); // Overloaded constructor
 * chaining }
 * 
 * public Person(String name, int age) { this.name = name; this.age = age; } }
 * Between Superclass and Subclass:
 * 
 * Use the super() keyword to invoke a constructor from the superclass.​
 * 
 * The super() call must be the first statement in the subclass constructor.​ *
 * Example:
 * 
 * java Copy public class Animal { private String species;
 * 
 * public Animal(String species) { this.species = species; } }
 * 
 * public class Dog extends Animal { private String name;
 * 
 * public Dog(String name) { super("Dog"); // Calling superclass constructor
 * this.name = name; } } Benefits:
 * 
 * Code Reusability: Reduces redundancy by allowing constructors to share
 * initialization logic.​
 * 
 * Cleaner Code: Enhances readability and maintainability by centralizing
 * initialization code.​
 * 
 * Flexibility: Provides multiple ways to initialize objects with different sets
 * of parameters.​
 * 
 * Considerations:
 * 
 * Ensure that constructor chaining does not lead to infinite loops by having a
 * base constructor that does not call another constructor.​
 * 
 * Be mindful of the order of constructor calls, especially when dealing with
 * inheritance, to ensure proper initialization.
 * 
 * By understanding and utilizing constructor chaining, Java developers can
 * write more efficient and organized code, leading to better software design
 * and implementation.​
 */
