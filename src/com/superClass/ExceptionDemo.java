package com.superClass;

import java.io.IOException;
import java.net.SocketException;
import java.sql.SQLException;

/** runtime exceptions **/
class Base {
	public void show() throws  RuntimeException{
		System.out.println("Base");
	}
}

class Child extends Base {
	public void show() throws  NullPointerException {
		System.out.println("Child");
		throw new NullPointerException();
	}
}


/** checked exceptions **/
class A {
	   public void foo1() throws IOException {}
	   public void foo2() throws IOException {}
	}

	class B extends A {
	   @Override
	   public void foo1() throws SocketException {} // allowed

//	   @Override
//	   public void foo2() throws SQLException {} // NOT allowed
	}
public class ExceptionDemo {
	public static void main(String args[]) {
		Base c=new Child();
		c.show();
	}
}
