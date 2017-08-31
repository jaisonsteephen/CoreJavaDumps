package com.thread;

public class AccessCurrentThreadDemo {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		System.out.println(id);
		System.out.println(name);
	}
}
