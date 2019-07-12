package com.thread;

public class JoinDemo extends Thread {
	int sleepTime;
	String name;
	
	JoinDemo(int sleepTime,String name) {
		this.sleepTime = sleepTime;
		this.name=name;
	}

	public void run() {
		try {Thread.sleep(sleepTime);} 
		catch (InterruptedException e) {}
		System.out.println(name);
	}

	public static void main(String args[]) {
		JoinDemo t1 = new JoinDemo(0,"first");
		JoinDemo t2 = new JoinDemo(2000,"second");
		JoinDemo t3 = new JoinDemo(0,"third");
		t1.start();
		t2.start();
		try {
			t2.join();//task t3 will start only after t2 joined joined back and completes its job
		} catch (Exception e) {
		}
		t3.start();
	}
}
