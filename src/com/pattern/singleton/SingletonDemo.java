package com.pattern.singleton;

class Singleton{
	private static Singleton instance=new Singleton();
	private Singleton(){
		
	}
	public static Singleton getInstance() {
		return instance;
	}
}

public class SingletonDemo {
public static void main(String args[]){
	Singleton s=Singleton.getInstance();
}
}
