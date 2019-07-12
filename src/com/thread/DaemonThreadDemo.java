package com.thread;

public class DaemonThreadDemo extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		DaemonThreadDemo t1 = new DaemonThreadDemo();// creating thread

		
		t1.setDaemon(true);       // now t1 is daemon thread. setDaemon should called b4 start. otherwise get IllegalThreadStateException
		t1.start();	
		//t1.setDaemon(true);     // java.lang.IllegalThreadStateException
	}
}
