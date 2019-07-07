package com.callback;

/**
 * Dont take for interview preparation
 * 
 * 
 * @author jaison
 *
 */

class Student {
	Logger l=new Logger();
	public void process(){
		String str=l.log("hi", this);
		System.out.println(str);
	}
	public String method() {
		return "2";
	}
	
}

class Logger{
	String log(String str,Student c){
		String two=c.method();
		return str+two+"log";
	}
}
public class Demo {

	public static void main(String ... args){
		Student st=new Student();
		st.process();
	}
}
