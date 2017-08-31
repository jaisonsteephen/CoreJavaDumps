package com.thread;

class MyThread5 extends Thread{
	@Override
	public void run(){
		for(int x=1;x<10;x=x+2){
			try {
				//this.sleep(60000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("================================="+x);
		}
	}
}
class MyThread6 extends Thread{
	@Override
	public void run(){
		
		for(int x=2;x<999999999;x=x+2){
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(x);
				System.out.println("--------is interrupted:"+this.interrupted());
			}
			
			
		}
	}
}
public class SleepDemo {
public static void main(String args[]){
	MyThread5 m1=new MyThread5();
	MyThread6 m2=new MyThread6();
	m1.start();
	m2.start();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	m2.interrupt();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("is interrupted:"+m2.isInterrupted());
	
	
}
}
