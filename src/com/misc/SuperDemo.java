package com.misc;

class MySuper {
	MySuper(){
		System.out.println("My Super");
	}
}

class MySub extends MySuper {
	MySub() {
		super();
		System.out.println("Sub");
	}
}

public class SuperDemo {
public static void main(String args[]){
	MySub s=new MySub();
}
}
