package com.multithreading;
//15 july 25

class Queue1 {
	int x;
	boolean isDataPresent = false;

	synchronized void store(int j) {
		if (!isDataPresent) {
			x = j;
			System.out.println("Produced: " + x);
			isDataPresent = true;
			notify();
		} else
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	synchronized void retrieve() {
		if (isDataPresent) {
			System.out.println("Consumed: " + x);
			isDataPresent = false;
			notify();
		} else
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

class Producer1 extends Thread {
	Queue1 k;

	public Producer1(Queue1 q) {
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

class Consumer1 extends Thread {
	Queue1 j;

	public Consumer1(Queue1 q) {
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

public class ProducerAndConsumerSolution_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue1 q = new Queue1();
		Producer1 p = new Producer1(q);
		Consumer1 c = new Consumer1(q);
		p.start();
		c.start();
	}

}
//@formatter:off
/*
 * 🎯 Concept: Solving Producer-Consumer Problem with wait() and notify()
 *
 * ✅ Goal Achieved:
 * - Coordinate two threads (Producer and Consumer) so that:
 *   1. Producer produces only when the buffer is empty
 *   2. Consumer consumes only when data is present
 *   3. Avoid race conditions, busy waiting, or data inconsistency
 *
 * 🔄 How the Fix Works:
 * - `Queue1` is a shared resource with:
 *     - A single data slot `x`
 *     - A flag `isDataPresent` indicating if data is available
 *
 * 🔐 Synchronized Methods:
 * - Both `store()` and `retrieve()` are marked `synchronized`, so only one thread can execute at a time
 * - Synchronization ensures mutual exclusion (only one thread accesses `x` at a time)
 *
 * 🧠 Thread Coordination (Inter-thread Communication):
 * - If producer finds `isDataPresent == true`, it means data hasn't been consumed yet → it calls `wait()`
 * - If consumer finds `isDataPresent == false`, it means no data is available → it calls `wait()`
 * - Once a thread finishes its job, it sets the flag accordingly and calls `notify()` to wake up the other thread
 *
 * ⏱️ No More Busy Waiting:
 * - Unlike a tight infinite loop (polling), `wait()` suspends the thread until it is notified
 * - Efficient CPU usage and clean execution flow
 *
 * 📝 Breakdown of Queue1 methods:
 *
 * → store(int j)
 *   - If no data is present, store the value, set the flag, notify the consumer
 *   - Else, wait for consumer to consume the current value
 *
 * → retrieve()
 *   - If data is present, print the value, reset the flag, notify the producer
 *   - Else, wait until data is produced
 *
 * ⚠️ Important Points:
 * - `wait()` and `notify()` must be called inside synchronized context (i.e., when thread holds the object's lock)
 * - `wait()` releases the lock temporarily, allowing the other thread to proceed
 * - `notify()` wakes up *one* waiting thread (could be producer or consumer depending on scheduler)
 *
 * 🧪 Behavior:
 * - Producer and Consumer alternate cleanly
 *   Produced: 1
 *   Consumed: 1
 *   Produced: 2
 *   Consumed: 2
 *   ...
 *
 * 🛑 Still a Single-Slot Buffer:
 * - This implementation uses only one shared variable (`x`)
 * - Real-world versions may use a circular buffer or bounded queue for multiple values
 *
 * 🧠 Concepts Practiced:
 * - synchronized methods (mutual exclusion)
 * - wait() and notify() (coordination between threads)
 * - shared object communication
 * - state-based decision-making (`isDataPresent` flag)
 *
 * ✅ Summary:
 * - This is a working, classic solution for single-buffer producer-consumer
 * - Clean separation of roles, no race conditions, efficient inter-thread signaling
 */
//next recommeded concept -
//Use wait() and notifyAll() for multiple producers/consumers
//Upgrade to a bounded buffer (multi-slot queue)
//Look into java.util.concurrent package (e.g., BlockingQueue)