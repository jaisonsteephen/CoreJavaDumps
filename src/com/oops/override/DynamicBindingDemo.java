package com.oops.override;

class Base {
	public void show() {
		System.out.println("Base");
	}
}

public class DynamicBindingDemo extends Base {

	public void show() {
		System.out.println("Derived");
	}

	public static void main(String... args) {
		Base b = new DynamicBindingDemo();
		b.show();

	}

}
