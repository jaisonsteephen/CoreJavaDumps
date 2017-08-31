package com.enums;

enum myEnum {
	Red("r"), Blue("b");
	String property;

	myEnum(String x) {
		this.property = x;
	}
	
}

public class EnumDemo {
	public static void main(String args[]) {
		myEnum x=myEnum.valueOf("Blue");
		System.out.println(x.ordinal());
	}
}
