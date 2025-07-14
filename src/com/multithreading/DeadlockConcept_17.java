package com.multithreading;
//14july25

class Rooman implements Runnable {
	String resource1 = "JAVA", resource2 = "PYTHON";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if (name.equals("javaTrainer"))
			javaSession(name);
		else
			pythonSession(name);
	}

	private void javaSession(String name) {
		// TODO Auto-generated method stub
		try {
			synchronized (resource1) {
				System.out.println("Java Trainer is engaging Java class");
				Thread.sleep(3000);
				synchronized (resource2) {
					System.out.println("Java trainer is engaging Python class");
					Thread.sleep(3000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void pythonSession(String name) {
		// TODO Auto-generated method stub
		try {
			// 1.to resolve the deadlock, one solution is to arrange the resource acquiring
			// the same order for both the threads
//			synchronized (resource2) {
			synchronized (resource1) {
				System.out.println("Python Trainer is engaging Python class");
				Thread.sleep(3000);
//				synchronized (resource1) {
				synchronized (resource2) {
					System.out.println("Python trainer is engaging Java class");
					Thread.sleep(3000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class DeadlockConcept_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rooman rooman = new Rooman();
		Thread t1 = new Thread(rooman);
		Thread t2 = new Thread(rooman);

		t1.setName("javaTrainer");
		t2.setName("pythonTrainer");

		t1.start();
		t2.start();
	}

}
//@formatter:off
/*
🔹 Concept: Deadlock in Multithreading

🔸 What is Deadlock?
- A deadlock occurs when two or more threads are blocked forever, each waiting for the other to release a resource.
- It usually happens when threads acquire locks in a different order.

🔸 How It's Simulated Here:
- We have two shared resources: "JAVA" and "PYTHON".
- Two threads represent two trainers:
    🧑‍🏫 `javaTrainer` locks JAVA first, then tries to lock PYTHON.
    🧑‍🏫 `pythonTrainer` locks PYTHON first, then tries to lock JAVA.
- If both threads acquire their first lock and then try to acquire the second (already held by the other), they get stuck — this is a **deadlock**.

🔒 Why It Happens:
Thread 1 (JavaTrainer):
    🔐 Lock resource1 (JAVA)
        ⏳ Waiting to lock resource2 (PYTHON)

Thread 2 (PythonTrainer):
    🔐 Lock resource2 (PYTHON)
        ⏳ Waiting to lock resource1 (JAVA)

Both threads are waiting for each other — resulting in a deadlock.

🔧 Fix Shown in Code:
- One way to avoid deadlock is to **always acquire locks in the same order**.
- Here, both threads can be forced to lock resource1 first, then resource2.
    ✅ That avoids the circular wait condition that causes deadlock.

🔁 Analogy:
- Imagine two people trying to enter two rooms, but in opposite order.
    🧍‍♂️ One enters Room A, then wants Room B.
    🧍 Another enters Room B, then wants Room A.
- They wait forever for the other to come out — that’s a deadlock.

✅ Key Takeaways:
- Always acquire multiple locks in a **consistent order** to avoid deadlocks.
- Try to minimize nested locking where possible.
- Java doesn’t detect deadlocks — so it’s your responsibility to design around them.

🧠 Bonus:
- Tools like **Thread Dump** or **jVisualVM** can help detect deadlocks at runtime.
- Java's `java.util.concurrent.locks` package offers more flexible locking mechanisms (e.g., `tryLock()` to avoid indefinite blocking).
*/
