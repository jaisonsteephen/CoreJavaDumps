package com.pattern;

import java.util.ArrayList;
import java.util.List;

interface AbstractStudent {
	public String getName();
}

class Student implements AbstractStudent {
	String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}

class NullStudent implements AbstractStudent {

	@Override
	public String getName() {
		return "Name Not Available";
	}
}

public class NullObjectPattern {
	public static void main(String... strings) {
		List<AbstractStudent> students = new ArrayList<>();
		students.add(new Student("jaison"));
		students.add(new Student("dhanya"));
		students.add(new NullStudent());
		
		for(AbstractStudent abstractStudent:students){
			System.out.println(abstractStudent.getName());
		}
		
	}
}
