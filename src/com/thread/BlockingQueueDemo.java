package com.thread;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {
public static void main(String args[]){
	BlockingQueue q=new LinkedBlockingQueue();
	A a=new A(q);
	B b=new B(q);
	a.start();
	b.start();
	
}
}

class A extends Thread{
	int i=0;
	BlockingQueue q;
	public A(BlockingQueue q){
		this.q=q;
	}
	public void run(){
		while(true){
			while(q.size()<10){
			System.out.println("Produce"+i);
			q.add(i++);
			}
		}
	}
}

class B extends Thread{
	BlockingQueue q;
	public B(BlockingQueue q){
		this.q=q;
	}
	public void run(){
		while(true){
			try {
				System.out.println("Consumes"+q.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}