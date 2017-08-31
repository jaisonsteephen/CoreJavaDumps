package com.test;
import java.util.Comparator;
import java.util.Arrays;
class ComparatorDemo{
	public static void main(String args[]){
		Student s1=new Student(20,40);
		Student s2=new Student(22,41);
		Student s3=new Student(21,42);
		Student s4=new Student(25,43);
		Student studentList[]=new Student[4];
		studentList[0]=s1;
		studentList[1]=s2;
		studentList[2]=s3;
		studentList[3]=s4;
		Arrays.sort(studentList,new MyComparator());
		System.out.println(studentList);
	}
}

class MyComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2){
		return s1.getAge()-s2.getAge();
	}
	
}

class Student{
	Student(int age,int mark){
		this.age=age;
		this.mark=mark;
	}
	int age;
	int mark;
	public int getAge(){
	return age;
	}
	public int mark(){
	return mark;
	}
	@Override
	public String toString() {
		return "age:"+age+" mark:"+mark+"--";
	}
}