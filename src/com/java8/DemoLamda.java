package com.java8;

@FunctionalInterface
interface MyInterface {
	void testMethod(String strData);
}


public class DemoLamda {
	public static void main(String args[]) {
		MyInterface func = (strData) -> {
			System.out.printf(strData);
		};
		func.testMethod("hi");
	}

}
