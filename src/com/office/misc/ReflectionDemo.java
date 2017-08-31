package com.office.misc;

public class ReflectionDemo {
	static ReflectionDemo ref;
	String []arguments;
	
	public static void main(String args[]){
		ref=new ReflectionDemo();
		ref.func(args);
		
	}
	
	public void func(String[] args){
		
		ref.arguments=args;
		for(String s:ref.arguments){
			System.out.println(s);
		}
	}
	

}
