package com.pattern.singleton;

class Resource{
	static double x;
	Resource(double d){
		this.x=d;
	}
	public static double getX() {
		return x;
	}
	
}

class Connection{
	static int x;
	public static Resource getResource(double d) {
		return new Resource(d);
	}
}


enum SingleTonEnum{
//with instance variable////////////////////////////////////////////////
//0.3199592006758303
//0.3199592006758303
	
/*	INSTANCE;
	private Resource resource;
	SingleTonEnum(){
		resource=Connection.getResource(Math.random());
	}
	public Resource getResource() {
		return INSTANCE.resource;
	}*/
	
//	without instance variable////////////////////////////////////////////
//	o/p  	
//	0.45993043645298914		
//	0.754572339735547
	INSTANCE;
	private Resource resource;
	SingleTonEnum(){
		//resource=Connection.getResource(Math.random());
	}
	public Resource getResource() {
		resource=Connection.getResource(Math.random());
		return resource;
	}
	
}
public class SingletonDemoWithEnum {
public static void main(String args[]){
	double x=SingleTonEnum.INSTANCE.getResource().getX();
	double y=SingleTonEnum.INSTANCE.getResource().getX();
	System.out.println(x);
	System.out.println(y);
}
}
