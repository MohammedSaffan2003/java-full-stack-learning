package com.multithreading;
//15 july 25

class Queue {
	int x;

	void store(int j) {
		x = j;
		System.out.println("Produced: " + x);
	}

	void retrieve() {
		System.out.println("Consumed: " + x);
	}
}

class Producer extends Thread {
	Queue k;

	public Producer(Queue q) {
		// TODO Auto-generated constructor stub
		k = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 1;
		for (;;) {
			k.store(x++);
		}
	}
}

class Consumer extends Thread {
	Queue j;

	public Consumer(Queue q) {
		// TODO Auto-generated constructor stub
		j = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (;;) {
			j.retrieve();
		}
	}
}

public class ProducerAndConsumerProblem_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
	}

}

/**
 * Here we can observer two important things.
 * 
 * 1. Consumer is consuming the recent values, instead of consuming at a FCFS
 * basis
 * 
 * 2. Consumer is consuming values even before they are produced
 * 
 * //Consumed: 179718 //Consumed: 179718 //Produced: 179718 //Produced: 179719
 * //Produced: 179720 //Produced: 179721
 */
//@formatter:off
/*
 * 🔍 Concept: Producer-Consumer Problem (Without Synchronization)
 *
 * 🧵 Scenario:
 * - You have two threads:
 *   1. Producer → generates values and stores them in a shared resource (Queue)
 *   2. Consumer → retrieves and processes values from that shared resource
 *
 * 🧩 Shared Resource:
 * - The `Queue` class has a single variable `x`, acting as a buffer (not an actual queue)
 * - Both threads access `x` directly without coordination
 *
 * ⚠️ What Goes Wrong (Problems Observed in Output):
 *
 * 1. ❌ **Race Conditions**:
 *    - Both producer and consumer access `x` at the same time
 *    - The consumer may read the same value multiple times or read uninitialized/incorrect data
 *    - Output example: `Consumed: 179718` before `Produced: 179718` is even printed
 *
 * 2. ❌ **No Fairness or Ordering**:
 *    - Values are not consumed in strict order (no First-Come-First-Serve guarantee)
 *    - Consumer may consume faster or slower than producer, leading to mismatch
 *
 * 3. ❌ **Tight Infinite Loops**:
 *    - Both `for(;;)` loops run endlessly without any delay or wait mechanism
 *    - This leads to CPU overutilization and non-deterministic output
 *
 * 🛠️ Root Cause:
 * - No synchronization or coordination between threads
 * - No mechanism to:
 *     ✅ Check whether a value has been produced before consuming it
 *     ✅ Wait for the producer to produce a value if the buffer is empty
 *     ✅ Wait for the consumer to consume before overwriting the buffer
 *
 * 📦 Queue Buffer Design (currently flawed):
 * - Only one value (`x`) with no flags or locks
 * - No check whether the value is available or consumed
 * - Essentially both threads are stepping on each other
 *
 * 🧠 Key Concepts Missing in This Version:
 * 1. `synchronized` methods or blocks to protect shared resource access
 * 2. `wait()` and `notify()` or `notifyAll()` to enable coordination
 * 3. A proper buffer structure like a queue or array with full/empty checks
 *
 * 🔄 What You’ll Fix in the Solution Version (next file):
 * ✅ Add synchronization to `store()` and `retrieve()` methods
 * ✅ Introduce a flag (e.g., `valueSet`) to track if value is ready
 * ✅ Use `wait()` in the consumer if no value is ready
 * ✅ Use `notify()` in the producer to wake up consumer
 *
 * 🔁 Real-world Analogy:
 * - A chef (producer) prepares dishes
 * - A waiter (consumer) serves the dish to customers
 * - Without communication, the waiter may:
 *     - Pick up an empty plate
 *     - Serve the same dish twice
 *     - Arrive before the dish is ready
 *
 * ✅ Takeaway:
 * - Threads must communicate to avoid inconsistent or unsafe access to shared resources
 * - This example sets up the perfect foundation for introducing inter-thread coordination with `wait()` and `notify()`
 */