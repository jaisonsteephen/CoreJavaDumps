package com.superClass;

class Base2{
	void show(){
		System.out.println("Base...........");
	}
}
class Child2 extends Base2{
	void show(){
		super.show();
		System.out.println("Child2...........");
	}
}
public class AccessSuperDemo {
public static void main(String args[]){
	Base2 b=new Child2();
	b.show();
}
}
