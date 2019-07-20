package com.thread;

class SynchornizationMistakes extends Thread {
	private static int count = 0;

	// locking on this object lock
	public synchronized int getCount() {
		return count;
	}

	// locking on .class object lock
	public static synchronized void increment() {
		count++;
	}
}

public class StaticSyncWithNonStaticSyncIssues3 {

	public static void main(String args[]) {
		SynchornizationMistakes s=new SynchornizationMistakes();
	}

}
