package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String args[]) {
		List<String> strList = new ArrayList<>();
		strList.add("111");
		strList.add("222");
		strList.add("333");
		strList.add("444");
		strList.add("555");
		strList.add("666");
		strList.add("777");


		Iterator<String> itr=strList.iterator();
		while(itr.hasNext()){
			strList.remove("333");
			String x=itr.next();//ConcurrentModificationException
			System.out.println(x);
		}
	}
}
