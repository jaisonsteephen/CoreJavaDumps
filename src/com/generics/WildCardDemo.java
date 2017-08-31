package com.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
	public static void main(String... args) {
		WildCardDemo vd=new WildCardDemo();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(new Integer(2));
		list.add(3);
		list.add(4);
		vd.print(list);
	}

	public void print(List<Integer> list) {
		for (Integer l : list) {
			System.out.println(l);
		}
	}
}
