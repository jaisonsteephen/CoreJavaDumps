package com.java8;
import java.util.function.Predicate;

public class Java8Predicate {
public static void main(String arg[]){
	test(true);
}
public static void test(Predicate<Integer> x){
	x.negate();
}
}
