package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	Integer age;

	public Integer getAge() {
		return age;
	}

	public Student(Integer age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.getAge().compareTo(s.getAge());
	}
	

}

class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getAge().compareTo(s2.getAge());
	}

}

public class ComparatorDemo {
	public static void main(String args[]) {
		List<Student> stLt=new ArrayList<>();
		stLt.add(new Student(30));
		stLt.add(new Student(37));
		stLt.add(new Student(36));
		//Collections.sort(stLt,new MyComparator());
		Collections.sort(stLt);
		for(Student student:stLt){
			System.out.println(student);
		}
	}
}
