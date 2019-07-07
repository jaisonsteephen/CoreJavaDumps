package com.enums;

enum myEnum {
	Red("r"), Blue("b"),BlackWhite("blk","wht");
	String property1;
	String property2;
	
	myEnum(String x) {
		this.property1 = x;
	}
	myEnum(String x,String y){
		this.property2=y;
	}
	
}

public class EnumDemo {
	public static void main(String args[]) {
		myEnum en1=myEnum.valueOf("Red");
		System.out.println(en1.ordinal());
		
		myEnum en2=myEnum.valueOf("BlackWhite");
		System.out.println(en2.property2);
		System.out.println(en2.ordinal());
	}
}
