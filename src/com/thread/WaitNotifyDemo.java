package com.thread;

import java.util.LinkedList;
import java.util.Queue;

public class WaitNotifyDemo {
public static void main(String args[]){
	Queue q=new LinkedList();
	Job1 j=new Job1(q);
	Job2 j2=new Job2(q);
	j.start();
	j2.start();
}
}

class Job1 extends Thread{
	Queue q;
	int i=0;
	boolean stoperFlag=true;
	public void setStoperFlag(boolean stoperFlag) {
		this.stoperFlag = stoperFlag;
	}	
	Job1(Queue q){
		this.q=q;
	}
	public void run(){
		while(stoperFlag){
			synchronized(q){
				while(q.size()==10){
					try {
						q.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					q.add(i++);
					System.out.println("Inserted new Item"+i);
					q.notifyAll();
			}
		}
	}
}

class Job2 extends Thread {
	Queue q;
	boolean stoperFlag = true;

	public void setStoperFlag(boolean stoperFlag) {
		this.stoperFlag = stoperFlag;
	}

	Job2(Queue q) {
		this.q = q;
	}

	public void run() {
		while (stoperFlag) {
			synchronized (q) {
				while(q.size() == 0) {
					try {
						q.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					System.out.println("consumer"+q.poll());
					q.notifyAll();
			}
		}
	}
}