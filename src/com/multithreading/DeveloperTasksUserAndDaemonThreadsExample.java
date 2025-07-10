package com.multithreading;

import java.util.Scanner;

//10july25
//after UserThreadPt2
class VSCodeTasks extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if (name.equals("Typing"))
			typingTask();
		else if (name.equals("AutoSuggest"))
			autoSuggest();
		else
			autoSave();
	}

	private void autoSave() {
		// TODO Auto-generated method stub
		for (;;) {
			System.out.println("Auto save is running");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void autoSuggest() {
		// TODO Auto-generated method stub
		System.out.println("Auto Suggestion activated");
		int a = 64;
		for (;;) {
			a = (a - 65 + 1) % 26 + 65;
			System.out.println("Suggesting " + (char) a);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void typingTask() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words\nHit enter to save\nType /'q/' to exit");
		StringBuilder sb = new StringBuilder(" ");
		while (!sb.toString().equals("q")) {
			sb.setLength(0);
			sb.append(sc.next());
			System.out.println(sb.toString() + " :saved");
		}
		sc.close();
	}
}

public class DeveloperTasksUserAndDaemonThreadsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VSCodeTasks tt = new VSCodeTasks();
		VSCodeTasks asg = new VSCodeTasks();
		VSCodeTasks asv = new VSCodeTasks();

		tt.setName("Typing");
		asg.setName("AutoSuggest");
		asv.setName("AutoSave");

		tt.setDaemon(false);
		asv.setDaemon(true);
		asg.setDaemon(true);

		tt.start();
		asv.start();
		asg.start();
	}

}
//@formatter:off
/*
 * 🔹 Program: Simulating a real-world IDE (like VS Code) using threads
 * 🔸 Key Concepts:
 *
 * 1️⃣ Multi-threading for Parallel Features:
 *     - The class `VSCodeTasks` extends `Thread`.
 *     - Based on thread name, different "IDE tasks" are simulated:
 *         🔹 Typing (User Thread)
 *         🔹 Auto Suggestion (Daemon Thread)
 *         🔹 Auto Save (Daemon Thread)
 *
 * 2️⃣ Task Delegation by Thread Name:
 *     - The `run()` method checks the current thread’s name using:
 *           Thread.currentThread().getName()
 *     - Based on the name, it calls the appropriate task method:
 *         ✅ "Typing" → `typingTask()`
 *         ✅ "AutoSuggest" → `autoSuggest()`
 *         ✅ Else → `autoSave()`
 *
 * 3️⃣ Thread Type Behavior:
 *     - `Typing` thread is set as a **user thread** (`setDaemon(false)`).
 *     - `AutoSuggest` and `AutoSave` are set as **daemon threads** (`setDaemon(true)`).
 *     - JVM will keep running as long as the user thread (Typing) is active.
 *     - Once the user exits typing (`q`), the JVM shuts down and daemon threads are forcefully killed.
 *
 * 4️⃣ Functional Simulation:
 *     🔹 `typingTask()`:
 *         - Accepts user input using Scanner.
 *         - Each word is "saved" when entered.
 *         - Typing stops when the user types `q`.
 *
 *     🔹 `autoSuggest()`:
 *         - Loops infinitely.
 *         - Every 2 seconds, suggests a character cyclically (A–Z).
 *
 *     🔹 `autoSave()`:
 *         - Simulates a save every 4 seconds, running in the background.
 *
 * 5️⃣ Real-World Analogy:
 *     - Typing = User actively interacting (main job of the app).
 *     - AutoSave & AutoSuggest = Background services supporting the main task.
 *     - When typing ends, the app shuts down, and background threads are cleaned up.
 *
 * ⚠️ Daemon threads are stopped **abruptly** when user threads finish — no guarantee of cleanup or saving remaining data.
 *
 * ✅ Excellent illustration of:
 *     - Thread lifecycle
 *     - Daemon vs user thread distinction
 *     - Runnable logic branching using thread names
 *     - Safe Scanner usage with thread termination condition
 */
//@formatter:on
