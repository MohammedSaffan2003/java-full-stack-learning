package com.abstraction;

//can it have?

//constructor
//Instance block
//static block
//static method

abstract class MyExam {
	public MyExam() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside constructor");
	}

	{
		System.out.println("Inside instance block");
	}

	static {
		System.out.println("Inside static block");
	}

	static void m1() {
		System.out.println("Inside static method");
	}

	void m2() {
		System.out.println("Inside concrete method");
	}
}

public class CheckForSimilarityWithConcreteClass extends MyExam {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyExam obj = new CheckForSimilarityWithConcreteClass();
		MyExam.m1();
		obj.m2();

	}

}
//@formatter:off
/*
Execution Flow with Respect to Code, Static, Stack, and Heap Segments:

1. Class Loading Phase:
- The JVM loads the class `CheckForSimilarityWithConcreteClass` when `main` is invoked.
- During this loading, its superclass `MyExam` is also loaded.
- Static blocks execute at class-load time (once per classloader).
  => Output: "Inside static block" (from `MyExam`)
- Static method `main` is located and executed.

2. Object Creation:
- `MyExam obj = new CheckForSimilarityWithConcreteClass();`
  - This creates an object of `CheckForSimilarityWithConcreteClass`, 
  which *implicitly calls* the constructor of its superclass `MyExam` first.
  - Before the constructor executes:
    - The instance block in `MyExam` runs.
      => Output: "Inside instance block"
    - Then the constructor of `MyExam` runs.
      => Output: "Inside constructor"
  - `CheckForSimilarityWithConcreteClass` doesn't have its own constructor or instance block,
   so only the superclass logic applies.

3. Static Method Call:
- `MyExam.m1();`
  - This invokes the static method from the abstract superclass.
  => Output: "Inside static method"

4. Concrete Method Call:
- `obj.m2();`
  - This calls the concrete (non-static) method `m2()` defined in the abstract class `MyExam`.
  => Output: "Inside concrete method"

Final Output (Console):
Inside static block
Inside instance block
Inside constructor
Inside static method
Inside concrete method

Memory Segment Mapping:
- CODE: Definitions for `MyExam`, `CheckForSimilarityWithConcreteClass`, `main`, `m1`, `m2`
- STATIC: Static block and static method `m1()` of `MyExam`
- HEAP: Object of `CheckForSimilarityWithConcreteClass` (via reference `obj`)
- STACK: Method frames for `main`, constructor, `m1()`, and `m2()`

Key Notes:
- Abstract classes **can have**: constructors, static blocks, instance blocks, static methods,
 and concrete (non-abstract) methods.
- The constructor of an abstract class is invoked during object instantiation by a concrete subclass.
- Static blocks in abstract classes still execute at class-load time.
- Static methods in abstract classes can be accessed without an object.
*/
//@formatter:on
