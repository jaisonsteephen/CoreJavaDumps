package com.thread;

class Table {

	static synchronized int printTable(int n) {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
		return n*i;
	}
}

class MyThread01 extends Thread {
	int i;
	public void run() {
		i=Table.printTable(1);
	}
	public synchronized int getI(){
		return i;
	}
}

class MyThread02 extends Thread {
	int i;
	public void run() {
		i=Table.printTable(10);
	}
	public synchronized int getI(){
		return i;
	}
}

class MyThread03 extends Thread {
	int i;
	public void run() {
		i=Table.printTable(100);
	}
	public synchronized int getI(){
		return i;
	}
}

class MyThread04 extends Thread {
	int i;
	public void run() {
		i=Table.printTable(1000);
	}
	public synchronized int getI(){
		return i;
	}
}

public class StaticSyncWithNonStaticSyncIssues {
	//Issue --Static and non staic have no co-ordinate work
	
	public static void main(String t[]) {
		MyThread01 t1 = new MyThread01();
		MyThread02 t2 = new MyThread02();
		MyThread03 t3 = new MyThread03();
		MyThread04 t4 = new MyThread04();
		t1.start();
		t2.start();
		t3.start();		
		t4.start();
		System.out.println("t1--------------------------------"+t1.getI());
		System.out.println("t2--------------------------------"+t2.getI());
		System.out.println("t3--------------------------------"+t3.getI());
		System.out.println("t4--------------------------------"+t4.getI());
	}
}