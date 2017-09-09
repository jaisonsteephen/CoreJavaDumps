package com.oops.override;

class Parent{
	void show(){
		System.out.println("Parent");
	}
}
class Child extends Parent{
	void show(){
		System.out.println("Child");
	}
}
public class OverRiddingDemo {
public static void main(String args[]){
	Child c=new Child();
	c.show();
}
}
