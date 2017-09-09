package com.thread.sync;

class Table {

	/*synchronized*/ void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
	/*synchronized*/ void printTable2(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread8 extends Thread {
	Table t;

	MyThread8(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread9 extends Thread {
	Table t;

	MyThread9(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable2(100);
	}
}

public class SyncDemo {

	public static void main(String args[]) {
		Table obj = new Table();
		MyThread8 t1 = new MyThread8(obj);
		MyThread9 t2 = new MyThread9(obj);
		t1.start();
		t2.start();
	}
}
