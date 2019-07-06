package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8ForEachDemo {
public static void main(String args[]){
	List<String> strList=new ArrayList<>();
	strList.add("one");
	strList.add("two");
	strList.add("three");
	strList.add("four");
	strList.add("five");
	//strList.forEach(System.out::print);
	strList.forEach(System.out::println);
}
}
