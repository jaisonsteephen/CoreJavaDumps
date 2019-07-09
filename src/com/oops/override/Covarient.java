package com.oops.override;

class Vehicle {
	public Vehicle makeType() {
		return new Vehicle();
	}
}

class Car extends Vehicle {
//	public Vehicle makeType() {    In actual overridding it is something like this
//		return new Vehicle();
//	}
	public Car makeType() {    //  But we can return the narrow return types, for the override fun. 		                  
		return new Car();      //  this is termed as covarient return 
	}
}

public class Covarient {
	public static void main(String args[]) {

	}
}
