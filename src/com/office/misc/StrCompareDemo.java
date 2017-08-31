package com.office.misc;

public class StrCompareDemo {
String fun(Object o1,Object o2){
	return (o1==o2)+" "+o1.equals(o2)+" "+(o1.hashCode()==o2.hashCode());
}
public static void main(String args[]){
	StrCompareDemo d3=new StrCompareDemo();
	String s1=new String("first");
	String s2=new String("first");
	System.out.println(d3.fun(s1,s2));
}
}
