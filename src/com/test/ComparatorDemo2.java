package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student2{
	Integer mark;
	Student2(int mark){
		this.mark=mark;
	}
}

class Comparator2 implements Comparator<Student2>{
	Student2 s1,s2;

	public int compare(Student2 s1,Student2 s2){
		return s1.mark.compareTo(s2.mark);
	}
}

public class ComparatorDemo2 {
public static void main(String args[]){
	List<Student2> stdLt=new ArrayList<>();
	stdLt.add(new Student2(2));
	//Arrays.sort(stdLt,new Comparator2());
}
}
