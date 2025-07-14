package com.multithreading;
//14july25

class SyncClass implements Runnable {
	@Override
//	synchronized public void run() { //when we apply synchronized to the method,
	// we block the entire method for single thread at a time, which is not desired
	// all time, so need to block only few lines of them

	public void run() {
		String name = Thread.currentThread().getName();
		// my version
//		for (int i = 1; i < 11; i++) {
//			System.out.println(name + " executing line " + i);
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		try {
			System.out.println(name + " executing line 1");
			Thread.sleep(2000);

			System.out.println(name + " executing line 2");
			Thread.sleep(2000);
			System.out.println(name + " executing line 3");
			Thread.sleep(2000);
			System.out.println(name + " executing line 4");
			Thread.sleep(2000);
			synchronized (this) { // here we acquire the lock of object we are sharing, that is "this" in this
									// context
				System.out.println(name + " executing line 5");
				Thread.sleep(2000);
				System.out.println(name + " executing line 6");
				Thread.sleep(2000);
				System.out.println(name + " executing line 7");
			}
			Thread.sleep(2000);
			System.out.println(name + " executing line 8");
			Thread.sleep(2000);
			System.out.println(name + " executing line 9");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SynchronizedPt2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncClass sc = new SyncClass();
		Thread t1 = new Thread(sc);
		Thread t2 = new Thread(sc);
		Thread t3 = new Thread(sc);
		t1.setName("Java");
		t2.setName("AWS");
		t3.setName("VLSI");
		t1.start();
		t2.start();
		t3.start();
	}

}
/*
 * When Rajinikanth is passing through MMK road why block whole Rajajinagar,only
 * MMK road is enough right.
 */
//@formatter:off
/*
🔹 Concept: Selective Synchronization using Synchronized Blocks

🔸 Problem:
- In multithreaded programs, sometimes we need to protect only a portion of the code (critical section),
  not the entire method.
- Synchronizing the whole method (`synchronized public void run()`) blocks all lines unnecessarily,
  reducing concurrency and performance.

🔸 Solution:
- Use a `synchronized` block instead of a synchronized method.
- `synchronized (this) { ... }` ensures only that block is protected, while other parts of the method
  can still run concurrently in different threads.

🔒 How it works here:
- All threads share the same SyncClass object.
- Only lines 5, 6, and 7 are inside the synchronized block.
- That means:
    ✅ Lines 1–4 and 8–9 can be executed by multiple threads at the same time.
    🔐 Lines 5–7 will be executed by **only one thread at a time**.
    Others wait until the lock on `this` is released.

🔁 Analogy:
- Rajinikanth is walking down MMK Road — we block only that road, not the whole city.
- Similarly, we block only critical lines, not the entire run() method.

✅ Key Takeaway:
- Synchronizing only what's needed improves efficiency while still preventing race conditions.
- `synchronized (this)` locks the shared object (here, `sc`), ensuring safe access to shared data.

🧠 Bonus:
- You could also use other object-level locks (e.g., a private final Object lock = new Object();).
- This lets you have multiple unrelated critical sections inside the same object.
*/
