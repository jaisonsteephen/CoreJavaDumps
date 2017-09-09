package com.thread.sync;

class Table2 {
	
	public synchronized void  print(int x) throws InterruptedException{
		for(int i=1;i<5;i++){
			System.out.println(i*x);
			Thread.sleep(1000);
		}
	}
}
public class SyncDemo2 {
	
	public static void main(String args[]){
		Table2 t=new Table2();
		Thread t1=new Thread(){
			public void run(){
				try {
					t.print(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2=new Thread(){
			public void run(){
				try {
					t.print(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t2.start();
		
	}

}
