package com.thread.threadVsRunnable;

public class Demo {
public static void main(String ... args) throws InterruptedException{
	Thread t1=new ExtendThread();
	Thread t2=new ExtendThread();
	ImplementRun i=new ImplementRun();
	Thread i1=new Thread(i);
	Thread i2=new Thread(i);
	
	t1.start();
	t1.join();
	i1.start();
	i2.start();
	t2.start();

	

}
}
