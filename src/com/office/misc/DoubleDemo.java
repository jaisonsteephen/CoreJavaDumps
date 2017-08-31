package com.office.misc;

public class DoubleDemo {
public static void displayDouble(Double ...d){
	for(int i=0;i<d.length;i++){
		System.out.println(d[i]+ " ");
	}
}

public static void main(String args[]){
	displayDouble(43.2,23.2,34.5);
}
}
