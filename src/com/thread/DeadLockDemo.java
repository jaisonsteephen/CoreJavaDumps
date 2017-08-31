package com.thread;

class MyThread4 extends Thread {
	public void run() {
		try {
			System.out.println("kkkkkk");
			join();
			System.out.println("MMM");
		} catch (Exception e) {
		}
	}
}

public class DeadLockDemo {
	public static void main(String args[]) {
		MyThread4 m = new MyThread4();
		m.start();
	}
}
