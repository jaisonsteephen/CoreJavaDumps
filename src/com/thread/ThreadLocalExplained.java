package com.thread;

class UserContext {
	private String contextId;

	public UserContext(String contextId) {
		this.contextId = contextId;
	}

	@Override
	public String toString() {
		return "UserContext [contextId=" + contextId + "]";
	}
}

public class ThreadLocalExplained implements Runnable {
	private static final ThreadLocal<UserContext> local = new ThreadLocal<UserContext>();

	public ThreadLocalExplained() {
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadLocalExplained());
		Thread thread2 = new Thread(new ThreadLocalExplained());
		Thread thread3 = new Thread(new ThreadLocalExplained());

		thread1.start();
		thread2.start();
		thread3.start();
	}

	@Override
	public void run() {
		saveContext();
		getAndRemoveContext();
	}

	public void saveContext() {
		UserContext ctx = new UserContext(Thread.currentThread().getName());
		local.set(ctx); // each thread saves a context to the shared ThreadLocal
		System.out.println("save to thread name: " + Thread.currentThread().getName());
	}

	public void getAndRemoveContext() {
		UserContext ctx2 = local.get(); // each thread gets its own copy
		System.out.println("delete--"+Thread.currentThread().getName() + " context string: " + ctx2);
		local.remove();
	}
}
