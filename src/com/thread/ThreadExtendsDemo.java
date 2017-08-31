package com.thread;

class MyThread11 extends Thread{
	int x;
	MyThread11(int x){
		this.x=x;
	}
	public void run(){
		for(int i=0;i<10;i++){
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(x*i);
		}
	}
}
public class ThreadExtendsDemo {
public static void main(String args[]){
	MyThread11 t1=new MyThread11(1);
	MyThread11 t2=new MyThread11(10);
	t1.start();
	t2.start();
	
}
}
