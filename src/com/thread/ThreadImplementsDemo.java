package com.thread;

class MyJob implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
}
public class ThreadImplementsDemo {
public static void main(String args[]){
	MyJob j=new MyJob();
	Thread t=new Thread(j);
	t.start();
}
}
