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
	INSTANCE;
	LoggerResource resource;
	SingletonEnum(){
		resource=new LoggerResource(Math.random());
	}
	public LoggerResource getResource() {
		return resource;
	}

}
public class SingletonDemoWithEnum {
	public static void main(String args[]) {
		double x=SingletonEnum.INSTANCE.getResource().getX();
		double y=SingletonEnum.INSTANCE.getResource().getX();
		double z=SingletonEnum.INSTANCE.getResource().getX();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
