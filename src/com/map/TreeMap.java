package com.map;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeMap {
public static void main(String args[]){
	TreeSet treeMap=new TreeSet();
	treeMap.add("Aundread");
	treeMap.add("Zakh");
	treeMap.add("Brore");
	treeMap.add("Xhousand");
	Iterator itr=treeMap.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next()+" ");
	}
	
//	TreeSet treeMap=new TreeSet();
//	treeMap.add(1);
//	treeMap.add(20);
//	treeMap.add(3);
//	treeMap.add(7);
//	Iterator itr=treeMap.iterator();
//	while(itr.hasNext()){
//		System.out.println(itr.next()+" ");
//	}
}
}
