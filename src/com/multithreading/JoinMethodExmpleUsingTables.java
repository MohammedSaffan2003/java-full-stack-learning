package com.multithreading;
//11july25

//after JoinMethodMultiThreading

class Tables extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if (name.equals("Two"))
			printTables(2);
		else if (name.equals("Three"))
			printTables(3);
		else
			printTables(4);
	}

	private void printTables(int j) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++)
			System.out.printf("%d x %d = %d\n", j, i, (j * i));
	}
}

public class JoinMethodExmpleUsingTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program stared");
		Tables _2 = new Tables();
		Tables _3 = new Tables();
		Tables _4 = new Tables();

		_2.setName("Two");
		_3.setName("Three");
		_4.setName("Four");

		_4.start();
		try {
			_4.join();
			_3.start();
			_3.join();
			_2.start();
			_2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program terminated");
	}

}
//@formatter:off
/*
 * 🔹 Demonstrates controlled thread execution using join()
 *
 * 🔸 Concept:
 * - Three threads print multiplication tables (2, 3, 4).
 * - Each thread is named and uses its name to decide which table to print.
 * - Threads are started **sequentially**, using join() to ensure:
 *     ✅ _4 finishes before _3 starts
 *     ✅ _3 finishes before _2 starts
 *
 * 🔸 Purpose of join():
 * - Forces main thread to wait for each table thread to complete
 * - Ensures orderly output (tables don't interleave)
 *
 * Self organizing threads - http://simp.ly/p/G7ZrbF
 */
