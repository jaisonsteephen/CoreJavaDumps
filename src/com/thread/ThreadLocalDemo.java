package com.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * @author jaison
 * There are situation where some unique id is generated and propagated to other layers as function parameters. this will
 * make the code redundant. to avoid this we can use Thread Local. If use so, there is no need to pass this as function
 * argument, but can take it directly from thread local
 * 
 * Here getThreadId, and startDate.get same data before and after sleep 
 *
 */
class ThreadLocalClz implements Runnable {
	// Atomic integer containing the next thread ID to be assigned
	private static final AtomicInteger nextId = new AtomicInteger(0);

	// Thread local variable containing each thread's ID
	private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return nextId.getAndIncrement();
		}
	};

	// Returns the current thread's unique ID, assigning it if necessary
	public int getThreadId() {
		return threadId.get();
	}

	// Returns the current thread's starting timestamp
	private static final ThreadLocal<Date> startDate = new ThreadLocal<Date>() {
		protected Date initialValue() {
			return new Date();
		}
	};

	@Override
	public void run() {
		System.out.printf("Starting Thread: %s : %s\n", getThreadId(), startDate.get());
		try {
			TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Thread Finished: %s : %s\n", getThreadId(), startDate.get());
	}
}

public class ThreadLocalDemo {

	public static void main(String[] args) {
		Thread thread = null;
		ThreadLocalClz r = new ThreadLocalClz();

		for (int i = 1; i < 50; i++) {
			thread = new Thread(r, "Thread" + i);
			thread.start();
		}

	}
}