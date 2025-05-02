package com.learnStatic;

class MyStaic {
	static int a;
	static int b;

	// static block
	static {
		System.out.println("Inside static block");
		a = 50;
		b = 100;
	}

	// static method
	static void m1() {
		System.out.println("Inside static method 1");
	}

	// instance variables
	int x;
	int y;

	// instance block
	{
		System.out.println("Inside instance block");
		x = 200;
		y = 300;
	}

	// instance method
	void m2() {
		System.out.println("Inside instance method");
	}

	public MyStaic() {
		System.out.println("Inside MyStatic constructor");
	}
}

public class IntroToStatic { // aka Zeta

	static { // Interview Question : Printing something without using main method -> place in
				// static block
		System.out.println("inside static main");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStaic.m1();
		MyStaic ms = new MyStaic();
		// ms.m1();// gives a warning but executes the method, it static method must be
		// accessed in a static way
		ms.m2();
		System.out.println(ms.x);
		System.out.println(ms.y);
//		System.out.println(ms.a); // this works but still you need to use this, as it is not the convention followed
//		System.out.println(ms.b); instead use below style
		System.out.println(MyStaic.a);
		System.out.println(MyStaic.b);

	}

}
/*
 * MyStaic.m1();
 * 
 * when i call this method the static block automatically gets executed
 * 
 * MyStaic ms = new MyStaic();
 * 
 * when we do this, the static block, instance block and constructor is being
 * executed in this order.
 */

//@formatter:off
/*
Execution Flow with Respect to Code, Static, Stack, and Heap Segments:

1. Class Loading:
- The JVM first loads the `IntroToStatic` class.
- The `static` block inside `IntroToStatic` runs immediately during class loading.
  => Output: "inside static main"
- The `main` method is then invoked.

2. Static Context - First Reference to MyStaic:
- When `MyStaic.m1()` is called, the ClassLoader loads the `MyStaic` class (if not already loaded).
- This triggers the static block inside `MyStaic` to execute once.
  => Output: "Inside static block"
- Static variables `a = 50` and `b = 100` are initialized.
  => These variables are stored in the STATIC segment.
- Then `m1()` runs.
  => Output: "Inside static method 1"

3. Object Creation (Heap + Stack + Code Interaction):
- `MyStaic ms = new MyStaic();` creates a new object.
- Memory for the object is allocated in the HEAP.
- A reference to it (`ms`) is stored in the STACK.
- Before constructor runs, instance block executes:
  => Output: "Inside instance block"
  => Instance variables `x = 200` and `y = 300` are initialized (stored in HEAP).
- Then, the constructor runs:
  => Output: "Inside MyStatic constructor"

4. Instance Method Call:
- `ms.m2()` is called.
  => Output: "Inside instance method"
- Method `m2()` runs with `ms` as its context (this pointer on the STACK).

5. Accessing Instance and Static Variables:
- `System.out.println(ms.x);` → accesses `x = 200` from HEAP.
- `System.out.println(ms.y);` → accesses `y = 300` from HEAP.
- `System.out.println(MyStaic.a);` → accesses static `a = 50` from STATIC.
- `System.out.println(MyStaic.b);` → accesses static `b = 100` from STATIC.

Final Output (Console):
inside static main
Inside static block
Inside static method 1
Inside instance block
Inside MyStatic constructor
Inside instance method
200
300
50
100

Memory Mapping Summary:
- CODE: All class/method definitions.
- STATIC: `MyStaic.a`, `MyStaic.b`, static blocks/methods.
- STACK: Method frames (`main`, `m1`, `m2`), local variables like `ms`.
- HEAP: The actual object of `MyStaic` (`ms`) holding `x` and `y`.
*/
//@formatter:on
