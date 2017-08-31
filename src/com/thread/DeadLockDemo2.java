package com.thread;

class DeadLock {
	String str1 = "First";
	String str2 = "Second";

	Thread tr1 = new Thread() {
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str2);
					}
				}
			}
		}
	};
	Thread tr2 = new Thread() {
		public void run() {
			while (true) {
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str1);
					}
				}
			}
		}
	};
}

public class DeadLockDemo2 {
	public static void main(String args[]) {
		DeadLock d = new DeadLock();
		d.tr1.start();
		d.tr2.start();
	}
}
