package com.java8;

interface inter1{
	default void show(){
		System.out.println("inter");
	};
}
interface inter2{
	default void show(){
		System.out.println("inter2");
	};
}
public class DefaultInterfaceDemo implements inter1,inter2{

	public static void main(String ... args){
		DefaultInterfaceDemo d=new DefaultInterfaceDemo();
		d.show();
	}
	@Override
	public void show() {
		System.out.println("Hi");
		
	}

/*	@Override
	public void show() {
		inter2.super.show();
	}*/

}
