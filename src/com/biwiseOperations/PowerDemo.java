package com.biwiseOperations;
/**
 * 
 * 
 * Dont take for interview preparation
 * 
 * @author jaison
 *
 */
public class PowerDemo {
	public static void main(String[] args) {
		// Basic way with O(n)
		int a = 2;
		int b = 3;
		long result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		System.out.println(result);

		// Efficient way with O(log n)
		System.out.println(ipow(a, b));
	}

	private static long ipow(int base, int exp) {
		long result = 1;

		while (exp != 0) {
			if ((exp & 1) == 1) {
				result *= base;
			}
			// right shifting bytes with sign 1 position
			// equivalent of division of 2
			exp >>= 1;
			base *= base;
		}

		return result;
	}
}