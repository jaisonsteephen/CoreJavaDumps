package com.pattern.singleton;

class SingletonLogger {
	
	//***********Singleton functionality Block **********************
	private SingletonLogger() {//	private constructor is necessary. 
							   //	otherwise default constructor will be accessible
		
	}
	private static SingletonLogger instance = null;
	public static SingletonLogger getSingleton() {
		if (instance == null) {
			synchronized (SingletonLogger.class) {
				if (instance == null) {
					instance = new SingletonLogger();
				}
			}
		}
		return instance;
	}

	//************Functionality apart from Singleton********************
	public void logMyMsg(String msg) {
		System.out.println(msg);
	}

}

public class SingletonDemoDoubleCheck {
	public static void main(String args[]) {
		SingletonLogger logger = SingletonLogger.getSingleton();
		SingletonLogger logger2 = SingletonLogger.getSingleton();
		//SingletonLogger logger3=new SingletonLogger();  //Not possible due to private constructor
		System.out.println(logger==logger2);
		logger.logMyMsg("Hello World");
	}
}
