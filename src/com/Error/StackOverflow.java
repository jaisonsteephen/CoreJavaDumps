package com.Error;

public class StackOverflow {
	 static long n;
	   public static void main(String[] a) {
	      n = 0;
	      try {
	         sub();
	      } catch (StackOverflowError e) {
	         e.printStackTrace();
	         System.out.println("Maximum nested calls: "+n);
	      }
	   }
	   private static void sub() {
		   System.out.println("hhhhhhhhhhhhhhhhhh");
	      n++;
	      sub();
	   }
}
