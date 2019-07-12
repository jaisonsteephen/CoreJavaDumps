package com.thread;

class MyThread6 extends Thread {
	@Override
	public void run() {

		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();	
		}
	}
}

public class InterruptDemo {
	public static void main(String args[]) {
		MyThread6 thread = new MyThread6();
		thread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		if (!thread.isInterrupted()) {
			thread.interrupt();
		}
		if (thread.isAlive() &&  thread.isInterrupted()) {
			System.out.println("Thread interrupted");
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		if (!thread.isAlive()) {
			System.out.println("Thread is finished. Hence interrupted status is:"+thread.isInterrupted());
			//Thread is finished. Hence interrupted status is:false
		}


	}
}
