package com.office.misc;

public class Demo2 {
public static void main(String ...args){
	Character c1='\u00ff';
	Character c2='\u00ff';
	System.out.printf("%b,%b", (c1.equals(c2)),(c1==c2));
	
//	Character c1='\uFFFF';
//	Character c2='\u00ff';
//	
//	System.out.printf("%s", c1.toString());
}
}
