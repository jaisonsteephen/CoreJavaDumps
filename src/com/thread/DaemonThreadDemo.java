package com.thread;
class MyThread3 extends Thread{
	MyThread3(){
		this.setDaemon(true);
	}
	public void run(){
		for(int i=0;;i++){
			System.out.println(i);
		}
	}
}
public class DaemonThreadDemo {
	 public static void main(String args[]){
		 MyThread3 m=new MyThread3();
		 m.start();
	 }
}
