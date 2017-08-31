package com.copyOnWrite;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Demo {

	public static void main(String args[]){
		List <Long> list=new CopyOnWriteArrayList<>();
		list.add(1L);
		list.add(2L);
		list.add(3L);
		list.add(4L);
		for(Long l:list){
			list.remove(2L);
			System.out.println(l);
		}
	}
}
