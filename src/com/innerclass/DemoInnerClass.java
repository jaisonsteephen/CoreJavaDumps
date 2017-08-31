package com.innerclass;

enum En{
	
	RED(2);
	private int x;
	private En(int x){
		this.x=x;
	}
	public int getX() {
		return x;
	}
	
}
public class DemoInnerClass {
public static void main(String args[]){
	//InnerSuper.Inner innerClass=new InnerSuper.Inner();
	int e=En.valueOf("RED").getX();
	System.out.println(e);
}
}
