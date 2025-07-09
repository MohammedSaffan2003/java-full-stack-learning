package com.multithreading;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Executing Main method");
		System.out.println(Thread.currentThread()); // [threadName, priorityNumber, methodNameExecuting]
		System.out.println("Main method completed");
	}

}
//@formatter:off
/*
 *Thread Scheduler - will give the Thread by asking the CPU
 *In order the thread scheduler to give a thread, it has to have a Stack of its own - 
 *that's why its been said that each thread has its own Stack 
 *
 *   To have a stack of its own, the class needs to have a Thread class (extended - inheritance)
 *
 * Thread - Line of Execution
 * 
 * 
 * To achieve MultiThreading we need to create a new stack for that part of execution(part of instruction).
 * New stack is created when we extend the Thread class , multithreading is started when start() pushes the run() on to the stack
 */
//@formatter:on