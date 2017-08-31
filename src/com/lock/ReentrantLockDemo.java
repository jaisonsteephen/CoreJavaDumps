package com.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockDemo {
public static void main(String args[]){
	
	
	
}
}

class ThreadClass extends Thread{
	static ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	public void run(){
		if (lock.isWriteLocked()){
			System.out.println("write locked");
		}
		else{
			lock.readLock().lock();
			System.out.println("readlocked");
			lock.readLock().unlock();
		}
	}
}