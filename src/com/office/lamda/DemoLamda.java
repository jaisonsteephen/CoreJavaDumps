package com.office.lamda;

@FunctionalInterface
interface MyInterface {
	void testMethod(String strData, int nData);
}

class Lamda01 {
	MyInterface func = (strData, nData) -> {
		System.out.printf("String =%s,Integer=%d", strData, nData);
	};
}

public class DemoLamda {
	public static void main(String args[]) {
		Lamda01 lamda = new Lamda01();
		lamda.func.testMethod("hai", 1);
	}

}
