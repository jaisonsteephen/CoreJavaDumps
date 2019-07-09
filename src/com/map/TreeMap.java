package com.map;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeMap {
public static void main(String args[]){
	TreeSet<String> treeMap=new TreeSet<>();
	treeMap.add("A");
	treeMap.add("Z");
	Iterator<String> itr=treeMap.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next()+" ");
	}
}
}
