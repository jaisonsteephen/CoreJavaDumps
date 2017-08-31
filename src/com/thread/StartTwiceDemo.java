package com.thread;

class MyThread extends Thread{
	public void run(){
		for(int i=0;;i++){
			
			System.out.println(i);
			try {
				this.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class StartTwiceDemo {
	public static void main(String ... args){
		MyThread MyThread1=new MyThread();
		MyThread1.start();
		MyThread1.start();
	}
	
	
}
