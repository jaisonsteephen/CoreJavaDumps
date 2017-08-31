package com.constructor;

class Demo{
public void show(){
	System.out.println("Parent");
}
}
public class ConstructorDemo extends Demo{
	
	public void show() throws ArithmeticException{
		System.out.println("Child");
	}
	public static void main(String args[]){
		ConstructorDemo d=new ConstructorDemo();
		try {
			d.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
