package com.java8.stream;

interface AntoherInterface{
	void myMethod1(int nData1,int nData2);
	//void myMethod2(long nData1,String nData2);
}
public class LamdaDemo {
public static void main(String args[]){
	//int nData1=1;
		AntoherInterface ai=(nData1,nData2)->System.out.println(nData1+"nData2");
		ai.myMethod1(6, 8);
}
}
