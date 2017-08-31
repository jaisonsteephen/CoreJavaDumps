package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student3 implements Comparable<Student3>{
	
	Integer x;
	Integer y;

	@Override
	public int compareTo(Student3 o) {
		return this.x.compareTo(o.x);
	}

	public Student3(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Student3 [x=" + x + ", y=" + y + "]";
	}
	
	
}
public class ComparableDemo {
	public static void main(String ...args){
		List<Student3> stList=new ArrayList<>();
		stList.add(new Student3(2,10));
		stList.add(new Student3(5,15));
		stList.add(new Student3(3,20));
		Collections.sort(stList);
		System.out.println(stList);
	}
}
