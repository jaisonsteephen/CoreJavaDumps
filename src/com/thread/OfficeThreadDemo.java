package com.thread;

public class OfficeThreadDemo extends Thread{
	private static int i=0;
	public void run(){
		i++;
		System.out.println(i);
	}
	public static void main(String args[]){
		i++;
		OfficeThreadDemo t=new OfficeThreadDemo();
		t.start();
	}

}
