package com.multithreading;

//9 july2025
//continue after MultipleTablesUsingSinglethreadClass
// 10 next UserAndDaemonThreadPt2
class UserThread extends Thread {
	public void run() {
		System.out.println("User Thread Started");
		for (int i = 0; i < 10; i++) {
//		for (;;) {
			System.out.println(i + 1);
//			System.out.println("User thread executing");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		System.out.println("User Thread ended");
	}
}

public class UserAndDaemonThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Started");
		UserThread uc = new UserThread();
		uc.start();
		System.out.println("Main Thread ended");
	}

}
/*
 * JVM has no control over User Thread, that's how it did not stop the execution
 * of the infinite loop
 */
//@formatter:off
/*
* 🔹 Program: Demonstrating a basic user thread
* 🔸 Key Concepts:
* 
* 1️⃣ Thread Inheritance:
*    - `UserThread` extends `Thread` and overrides the `run()` method.
*    - `run()` contains a loop printing numbers 1 to 10 with a delay.
* 
* 2️⃣ Main vs User Thread:
*    - Main thread starts first, then immediately spawns `UserThread`.
*    - Even if main finishes first, JVM waits for the user thread to complete.
*
* 3️⃣ Output Observation:
*    - Output may interleave based on CPU scheduling.
*    - You’ll see the main thread finish, but the user thread continues.
*
* ✅ JVM waits for all user threads (non-daemon) before shutting down.
*
* ❗If the loop was infinite (uncomment `for(;;)`), the user thread would run forever,
*    and JVM would not terminate, proving JVM has no control over user threads.
*/
//@formatter:on