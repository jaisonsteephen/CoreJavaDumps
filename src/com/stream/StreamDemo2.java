package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
public static void main(String args[]){
	List<Integer>arrayList=new ArrayList<Integer>();
	for(int i=0;i<10;i++)arrayList.add(i);
	Stream<Integer>sequentialstream=arrayList.stream();
	//Stream<Integer>FilteredNumbers=sequentialstream.filter(p->p->5);
	Stream<Integer>FilteredNumbers=sequentialstream.filter(p->p<5+2);
	FilteredNumbers.forEach(p->System.out.println(p+""));
}
}
