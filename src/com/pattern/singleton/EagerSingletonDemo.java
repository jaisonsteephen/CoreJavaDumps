package com.pattern.singleton;

class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}

public class EagerSingletonDemo {
	public static void main(String args[]) {
		EagerSingleton s = EagerSingleton.getInstance();
	}
}
