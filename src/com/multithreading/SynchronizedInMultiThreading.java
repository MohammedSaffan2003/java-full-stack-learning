package com.multithreading;
//11july25

//after JoinMethodExmpleUsingTables

class Board implements Runnable {

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println(name + " is accessing the board");
		try {
			Thread.sleep(3000);

			System.out.println(name + " is writing on the board");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " is done with the board");

	}

}
public class SynchronizedInMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this is shared, only resource for all threads
		Board board = new Board();
		Thread java = new Thread(board);
		Thread aws = new Thread(board);
		Thread vlsi = new Thread(board);

		// 1. here we explore the independent object locks
		// this will give independent access to resource, so all can access, due to many
		// resources/objects

		// ✅ When all threads share the same Board object → they synchronize on the same lock → only one thread enters run() at a time
		// ❌ When each thread gets its own Board object → they each get their own lock → multiple threads can access run() simultaneously
		// 🔐 synchronized is object-level, not method-level globally — so thread safety only works when threads share the same instance

//		Thread java = new Thread(new Board());
//		Thread aws = new Thread(new Board());
//		Thread vlsi = new Thread(new Board());

		java.setName("java");
		aws.setName("aws");
		vlsi.setName("vlsi");

		java.start();
		aws.start();
		vlsi.start();
	}

}
/*
 * Race round - more than one threads are trying to access the same resource
 * 
 * When we want to mark a block (or resource) to be accessed one at a time we
 * use "synchronized" keyword to it
 */
//@formatter:off
/*
 * 🔹 Concept: Thread synchronization to prevent race conditions
 *
 * 🔸 Problem Simulated:
 * - Multiple threads (java, aws, vlsi) try to access a shared resource: a "board"
 * - Without synchronization, threads may interleave unpredictably → race condition
 *
 * 🔸 Solution:
 * - `run()` method is marked `synchronized`, meaning:
 *     ✅ Only one thread can execute it at a time per object instance
 *     ✅ Others must wait for the current thread to finish
 *
 * 🔸 How it works:
 * - All threads share the same `Board` instance (common object)
 * - Only one thread at a time enters the synchronized `run()` method
 * - Others are blocked until the lock is released
 *
 * 🔄 Flow:
 * 1. One thread enters: prints "accessing", then "writing", then "done"
 * 2. Takes ~6 seconds per thread (2 x sleep(3000))
 * 3. Next thread acquires the lock and repeats
 * 4. Output order depends on which thread gets the lock first (not always java → aws → vlsi)
 *
 * 🔸 Why synchronized?
 * - Prevents simultaneous access to critical sections (e.g., writing to a board, file, database)
 * - Avoids inconsistent state and random behavior in multi-threaded environments
 *
 * ✅ Real-world analogy:
 * - A whiteboard that only one student can write on at a time
 * - Synchronization ensures proper queueing and fair access
 *
 * 🧠 Extra Tip:
 * - Synchronization is tied to the object (`Board`), not just the method
 * - If threads used different `Board` objects, `synchronized` would NOT block them
 */