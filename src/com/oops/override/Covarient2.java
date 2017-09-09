package com.oops.override;

class Parent1 {
	public Parent1 giveClass() {
		return this;
	}
	void showMsg(){
		System.out.println("Parent1");
	}
}

class Child1 extends Parent1 {
	public Child1 giveClass() {
		return this;
	}
	void showMsg(){
		System.out.println("Child1");
	}
}

public class Covarient2 {
	public static void main(String args[]) {
		Parent1 p1=new Child1();
		p1.giveClass().showMsg();
	}
}
