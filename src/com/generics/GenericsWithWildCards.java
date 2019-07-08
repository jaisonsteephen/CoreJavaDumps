package com.generics;

import java.util.ArrayList;
import java.util.List;

class Clas1 {

}

class Clas2 extends Clas1 {

}

class Clas3 extends Clas2 {

}

class Clas4 extends Clas3 {

}

class GenericsWithWildCards {
	public static void main(String[] args) {

		List<Clas1> cl1 = new ArrayList<>();
		List<Clas4> cl4 = new ArrayList<>();

		extend_FreeUpperBound(cl1);//Error Because it will allow not allow Parent class
		extend_FreeUpperBound(cl4);

		super_FreelowerBound(cl1);
		super_FreelowerBound(cl4);//Error Because it will allow not allow Child class

	}

	public static void extend_FreeUpperBound(List<? extends Clas3> list) {

	}

	public static void super_FreelowerBound(List<? super Clas3> list) {

	}

}