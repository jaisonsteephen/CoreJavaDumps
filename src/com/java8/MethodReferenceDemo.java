package com.java8;

interface Process{
	public int apply(int a,int b);
}

class Arithmetic{
	public int add(int a,int b){
		return a+b;
	}
}

class ArithmeticSub{
	public int sub(int a,int b){
		return a-b;
	}
}

public class MethodReferenceDemo {
public static void main(String ... args){
	Arithmetic arith=new Arithmetic();
	Process bifun=new Arithmetic()::add;
	int result=bifun.apply(10, 15);
	System.out.println(result);
	
	bifun=new ArithmeticSub()::sub;
	result=bifun.apply(10, 15);
	System.out.println(result);
}
}
