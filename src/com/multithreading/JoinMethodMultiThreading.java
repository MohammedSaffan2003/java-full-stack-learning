package com.multithreading;

//11july25
//after DeveloperTasksUserAndDaemonThreadsExample
class UserThreadClass extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("User Thread started");
		for (int i = 0; i < 10; i++)
			System.out.println("User thread executing");
		System.out.println("User Thread ended");
	}
}
public class JoinMethodMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread started");
		UserThreadClass userThread = new UserThreadClass();
		System.out.println("Database connection establsihed");
		userThread.start();
		try {
			// it says the main thread that join me when i complete my execution
			userThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Database connection terminated");
		System.out.println("Main Thread ended");
	}

}
//@formatter:off
/*
 * 🔹 Program: Demonstrates the use of Thread.join() for coordination
 * 🔸 Key Concepts:
 *
 * 1️⃣ User Thread Creation:
 *     - `UserThreadClass` extends `Thread` and overrides `run()` to simulate a task.
 *     - Prints a message 10 times to represent execution workload.
 *
 * 2️⃣ Thread Coordination with join():
 *     - `userThread.start()` starts the user thread in parallel.
 *     - `userThread.join()` tells the main thread: 
 *         ❝ Wait for this thread to finish before continuing ❞
 *     - Main thread pauses at `join()` until `userThread` completes its work.
 *
 * 3️⃣ Real-World Analogy:
 *     - Simulates a scenario like:
 *         🔹 Main thread = sets up and tears down a database connection
 *         🔹 User thread = performs database operations (business logic)
 *         🔹 `join()` ensures cleanup happens **only after** user thread finishes
 *
 * 4️⃣ Output Flow:
 *     - "Database connection established"
 *     - User thread prints its execution logs
 *     - Once user thread ends, `join()` unblocks
 *     - Then main thread prints: 
 *         ✅ "Database connection terminated"
 *         ✅ "Main Thread ended"
 *
 * 🧠 Why join() is useful:
 *     - Prevents premature shutdown
 *     - Coordinates dependent task completion
 *     - Common in real-world multi-threaded systems like:
 *         🔹 Transaction processing
 *         🔹 Background worker pipelines
 *
 * ⚠️ Note:
 *     - Without `join()`, main thread could end before the user thread finishes,
 *       causing early termination or resource cleanup too soon.
 */
