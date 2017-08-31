package com.Error;

public class OutOfMemory {
	public static void main(String[] args) throws Exception {
		int[] memoryFillIntVar = new int[20000000*5000];
	}
}
