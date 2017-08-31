package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
public static void main(String ...args){
	int x[]=new int[10];
	x[0]=1;
	x[1]=2;
	x=Arrays.copyOf(x, 30);
	System.out.println(Arrays.toString(x));
	
	
}
}
