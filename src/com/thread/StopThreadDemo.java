package com.thread;

public class StopThreadDemo extends Thread {
	boolean indicator;

	public static void main(String... args) {

	}

	@Override
	public void run() {
		for (int i = 0;; i++) {
			if (indicator) {
				break;
			}
			System.out.println(i);
		}
	}
}
