package com.thread;

/**
 * 
 * @author jaison
 * 
 * Not yet find a proper solution for mixing static sync with non-static 
 *
 */
class Table {
	static int number;
	static String x = "";

	void printTable(int n, int sleep) {
		synchronized (x) {
			try {
				Thread.sleep(sleep);
				number = n;
			} catch (Exception e) {
			}
		}
	}

	int get() {
		synchronized (x) {
			return number;
		}
	}
}

class MyThread01 extends Thread {
	int number;
	int sleep;

	MyThread01(int number, int sleep) {
		this.number = number;
		this.sleep = sleep;
	}

	public void run() {
		Table t = new Table();
		t.printTable(number, sleep);
	}
}

public class StaticSyncWithNonStaticSyncIssues {
	// Issue --Static and non staic have no co-ordinate work

	public static void main(String args[]) {
		MyThread01 t1 = new MyThread01(1, 0);
		MyThread01 t2 = new MyThread01(5, 7000);
		t1.start();
		t2.start();
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
		Table t = new Table();
		System.out.println(t.get());
	}
}