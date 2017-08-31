package com.thread;

public class DemoJoin extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		DemoJoin t1 = new DemoJoin();// creating thread
		DemoJoin t2 = new DemoJoin();
		DemoJoin t3 = new DemoJoin();

		// now t1 is daemon thread

		t1.start();// starting threads
		t2.start();
		t1.setDaemon(true);
		t3.start();
	}
}
