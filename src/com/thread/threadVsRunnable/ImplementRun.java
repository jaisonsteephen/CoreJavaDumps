package com.thread.threadVsRunnable;

public class ImplementRun implements Runnable {
	private int count=0;
	@Override
	public void run() {
		count++;
		System.out.println("ImplementRun"+Thread.currentThread().getName());
	}

}
