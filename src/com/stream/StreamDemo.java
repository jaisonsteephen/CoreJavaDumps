package com.stream;

import java.util.stream.Stream;

public class StreamDemo {
public static void main(String args[]){
	Stream<Integer>memberValues=Stream.of(3,4,5);
	memberValues.forEach(i->System.out.println(i+","));
	//memberValues.forEach(i->System.out.println(i+","));//java.lang.IllegalStateException: stream has already been operated upon or closed	
}
}
