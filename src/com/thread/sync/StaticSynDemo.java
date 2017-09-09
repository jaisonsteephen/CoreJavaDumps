package com.thread.sync;

class MyStaticClass {
	static private Object obj = new Object();

	public void staticWait() {
		synchronized (obj) {
			try {
				//obj.wait();
//				System.out.println("b4 sleep-----------------------------");
//				Thread.sleep(4000);
				System.out.println("wait-----------------------------");
				while(true){
					
				}
			} catch (Exception e) {
			}
		}
	}

	public void staticNotify() {
		synchronized (obj) {
			System.out.println("in notify-----------------------------");
			while(true){
				
			}
			//obj.notify();
		}
	}
}

class Thread1 extends Thread{
	public void run(){
		MyStaticClass mStaticClass=new MyStaticClass();
		mStaticClass.staticWait();
	}
}
class Thread2 extends Thread{
	public void run(){
		MyStaticClass mStaticClass=new MyStaticClass();
		mStaticClass.staticNotify();
	}
}

class StaticSynDemo {
	public static void main(String args[]) {
		new Thread1().start();
		new Thread2().start();
	}
}