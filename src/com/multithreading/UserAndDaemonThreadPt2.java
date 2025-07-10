package com.multithreading;

//10july2025
//after UserAndDaemonThread
class UserThreadPt2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("User Thread started");
		for (int i = 1; i < 11; i++)
			System.out.println("User Thread executing");
		System.out.println("User Thread ended");
	}
}

class DaemonThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Daemon Thread started");
		for (;;) {
			System.out.println("Daemon Thread executing");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class UserAndDaemonThreadPt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserThreadPt2 utp = new UserThreadPt2();
		DaemonThread dt = new DaemonThread();
		dt.setDaemon(true);
		utp.start();
		dt.start();
		System.out.println("Main method ended");
	}

}
//@formatter:off
/*
 * 🔹 Program: Demonstrating Daemon vs User Threads
 * 🔸 Key Concepts:
 * 
 * 1️⃣ UserThreadPt2 (User Thread):
 *    - Prints "User Thread executing" 10 times and then ends.
 *    - This is a regular user (non-daemon) thread.
 * 
 * 2️⃣ DaemonThread:
 *    - Runs an infinite loop printing "Daemon Thread executing" every 2 seconds.
 *    - Marked as a daemon using `setDaemon(true)` before `start()`.
 * 
 * 3️⃣ JVM Behavior:
 *    - JVM will NOT wait for daemon threads to finish.
 *    - As soon as all **user threads (including main)** finish, JVM exits,
 *      and daemon threads are **forcefully killed** without cleanup.
 * 
 * 🔍 Output Behavior:
 *    - You may see 1–2 prints from the daemon thread.
 *    - Once `UserThreadPt2` ends, the JVM shuts down, even if daemon thread is in an infinite loop.
 *
 * ⚠️ Daemon threads should never be used for important tasks like saving files or updating databases.
 *
 * ✅ Best Use Case for Daemon Threads:
 *    - Background tasks like logging, monitoring, cache cleaning, or timers.
 */
//@formatter:on
