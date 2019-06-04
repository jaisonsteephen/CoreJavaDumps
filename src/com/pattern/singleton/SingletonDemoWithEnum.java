package com.pattern.singleton;

/**
 * 
 * @author jaison
 * 
 * output
 * ------------
 * 0.631532501517981
 * 0.631532501517981
 * 0.631532501517981
 *
 */
class LoggerResource{
	private double x;
	LoggerResource(double d){
		this.x=d;
	}
	public double getX() {
		return x;
	}
}
enum SingletonEnum {
	INSTANCE,INSTANCE2;
	LoggerResource resource;
	SingletonEnum(){
		resource=new LoggerResource(Math.random());
	}
	public double getResourceValue() {
		return resource.getX();
	}
}
public class SingletonDemoWithEnum {
	public static void main(String args[]) {
		SingletonEnum enum1=SingletonEnum.INSTANCE;
		SingletonEnum enum2=SingletonEnum.INSTANCE2;		
		
		System.out.println(enum1.compareTo(enum2));
		System.out.println(enum1.equals(enum2));
		System.out.println(enum1==enum2);
		
		double x=SingletonEnum.INSTANCE.getResourceValue();
		double y=SingletonEnum.INSTANCE.getResourceValue();
		double z=SingletonEnum.INSTANCE.getResourceValue();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
