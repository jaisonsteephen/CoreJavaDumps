package com.thread;

class MyThread7 extends Thread {
	@Override
	public void run() {
		
		this.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("inside UncaughtExceptionHandler:	"+e);
			}
		});
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("inside addShutdownHook");
			}
		});
		throw new NullPointerException();
		
	}
}

public class UncaughtHandlerDemo {
	public static void main(String args[]) {
		MyThread7 m=new MyThread7();
		m.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
