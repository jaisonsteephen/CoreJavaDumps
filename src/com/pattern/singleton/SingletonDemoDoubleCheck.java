package com.pattern.singleton;
/**
 * 
 * @author jaison
 * Here we are using SingletonClz to access LoggerClass.
 * LoggerClass will not be accessible to outside world, since we are not providing the lib that contain LoggerClass to them.
 *
 *  output
 *  -----------
 *  true
 *  Hello World
 */
class LoggerClass {
	
	public void logMyMsg(String msg) {
		System.out.println(msg);
	}
	
}

class SingletonClz  extends LoggerClass{
	
	private SingletonClz() {
		// private constructor is necessary.
		// otherwise default constructor will be accessible to outside world i.e. SingletonDemoDoubleCheck 
	}
	private static SingletonClz instance = null;
	public static SingletonClz getSingleton() {
		if (instance == null) {
			synchronized (SingletonClz.class) {
				if (instance == null) {
					instance = new SingletonClz();
				}
			}
		}
		return instance;
	}
}

public class SingletonDemoDoubleCheck {
	public static void main(String args[]) {
		LoggerClass c=new LoggerClass();
		SingletonClz logger = SingletonClz.getSingleton();
		SingletonClz logger2 = SingletonClz.getSingleton();
		//SingletonLogger logger3=new SingletonLogger();  //Not possible due to private constructor
		System.out.println(logger==logger2);
		logger.logMyMsg("Hello World");
	}
}
