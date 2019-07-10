package com.thread.threadVsRunnable;

public class ExtendThread extends Thread{
private int counter=0;
@Override
public void run(){
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	counter++;
	System.out.println("ExtendThread"+currentThread().getName());
}

}
