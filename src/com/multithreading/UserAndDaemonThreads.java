package com.multithreading;

//9 july2025
//continue after MultipleTablesUsingSinglethreadClass

class UserThread extends Thread {
	public void run() {
		System.out.println("User Thread Started");
		for (int i = 0; i < 10; i++)
			System.out.println(i + 1);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
