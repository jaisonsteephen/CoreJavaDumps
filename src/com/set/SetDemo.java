package com.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String args[]){
	Set hashset=new HashSet();
	hashset.add(null);
	System.out.println(hashset);
	
	Set treeset=new TreeSet();
	treeset.add(null);
	System.out.println(treeset);
}

}
