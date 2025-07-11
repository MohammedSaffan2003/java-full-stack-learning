package com.multithreading;

//9 July 2025
//05 next TablesThreadsByRunnableImpl
public class WhyRunnableImpIsBetterThanThreadClass {
// using Runnable is cleaner for separating logic and threading behavior, which makes the code more modular and testable — especially important in large applications.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Technical clarity with a flow
/*
 * In Java, every class implicitly extends Object, the root class.
 * 
 * If a class A extends the Thread class, it gains multithreading capabilities
 * by overriding the run() method. However, this introduces a limitation:
 * 
 * If another class B later needs to extend A, it indirectly inherits from
 * Thread as well — even if B doesn't need multithreading. This creates tight
 * coupling and reduces flexibility due to Java's single inheritance rule.
 * 
 * To avoid this, we implement the Runnable interface instead.
 * 
 * Runnable is a functional interface that contains a single abstract method:
 *   public abstract void run();
 * 
 * The Thread class itself implements Runnable, but it does not provide a body
 * for run(); it relies on user-defined subclasses or Runnable instances to
 * implement it.
 * 
 * By implementing Runnable, a class can still be used with threads (by passing
 * it to a Thread constructor) while retaining the freedom to extend another
 * class if needed.
 */

/*
 * My understanding:
 * 
 * Every class extends Object, so when (say A) A class inherits Thread class, we
 * proceed with MultiThreading.
 * 
 * But when another class (say B) B inherits A, knowingly or unknowingly the
 * Thread class comes under its inheritance which might not be necessary for B
 * class.
 * 
 * To overcome this we implement Runnable.
 * 
 * Runnable interface has public abstract void run();. Thread class implements
 * the Runnable interface without providing the method body of run(). So for
 * this, we just directly implement the run() from the interface.
 */