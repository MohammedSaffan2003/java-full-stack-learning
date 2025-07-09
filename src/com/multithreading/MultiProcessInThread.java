package com.multithreading;

import java.util.Scanner;

//continue from MultiThreadsForTables
class PrintCharThread extends Thread {
	public void run() {
		System.out.println("Entered PrintChar " + Thread.currentThread());
		for (int k = 65; k < 91; k++) {
			if (k == 70) {
				System.out.println("Exited through stop()");
				this.stop();
			}
			System.out.println((char) k);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				// TODO: handle exception
				System.out.println(ie.getMessage());
			}
		}
		System.out.println("Exited PrintChar " + Thread.currentThread());
	}
}

class PrintNumbers extends Thread {
	public void run() {
		System.out.println("Enter PrintNumbers " + Thread.currentThread());
		for (int i = 0; i < 10; i++)
			System.out.println(i + 1);
		System.out.println("Exited PrintNumbers " + Thread.currentThread());
	}
}

class AddThread extends Thread {
	public void run() {
		System.out.println("Enter AddThread " + Thread.currentThread());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first interger ");
		int a = sc.nextInt();
		System.out.println("Enter second interger ");
		int b = sc.nextInt();
		System.out.println("Addition of " + a + " + " + b + " is " + (a + b));
		sc.close();
		System.out.println("Exited AddThread " + Thread.currentThread());

	}
}

public class MultiProcessInThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started main thread");
		PrintCharThread pct = new PrintCharThread();
		AddThread at = new AddThread();
		PrintNumbers pn = new PrintNumbers();
		// we need to call simultaneously to see the randomness
		// 1.
		pct.start();
		at.start();
		pn.start();
//		pct.start(); // this will throw IllegalThreadStateException - if started same thread again
		// 2. -- this execution without calling the start method and only calling the
		// run method will only make the program sequential -- and executes the
		// methods/program in the same stack - without creating the new stack for each
		// thread class
//		pct.run();
//		at.run();
//		pn.run();

		System.out.println("Exited main method " + Thread.currentThread());
	}

}

//@formatter:off
/*
 *  //this was when i added twice the start method for pct
 * Started main thread
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:800)
	at msjJava/com.multithreading.MultiProcessInThread.main(MultiProcessInThread.java:51)
Enter PrintNumbers Thread[Thread-2,5,main]
Entered PrintChar Thread[Thread-0,5,main]
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
1
2
Exited PrintChar Thread[Thread-0,5,main]
Enter AddThread Thread[Thread-1,5,main]
3
4
5
6
7
8
9
10
Exited PrintNumbers Thread[Thread-2,5,main]
Enter first interger 
20
Enter second interger 
12
Addition of 20 + 12 is 32
Exited AddThread Thread[Thread-1,5,main]

 * 
 */
//@formatter:on
