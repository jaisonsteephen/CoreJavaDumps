package com.thread.sync;

//This code is not fine. not take for interview
class StaticClass {

	public synchronized void staticWait(Object obj) {

		System.out.println("wait----------------------------");
		while (true) {

		}
	}

	public synchronized void staticNotify(Object obj) {

		System.out.println("notify----------------------------");
		while (true) {

		}
	}

}

class Thread11 extends Thread {
	Object o;

	public Thread11(Object o) {
		this.o = o;
	}

	public void run() {
		StaticClass mStaticClass = new StaticClass();
		mStaticClass.staticWait(o);
	}
}

class Thread22 extends Thread {
	Object o;

	public Thread22(Object o) {
		this.o = o;
	}

	public void run() {
		StaticClass mStaticClass = new StaticClass();
		mStaticClass.staticNotify(o);
	}
}

public class StaticDemo {
	public static void main(String args[]) {
		Object o = new Object();
		new Thread11(o).start();
		new Thread22(o).start();
	}
}