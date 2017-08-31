package com.abstraction.vehicle;

public abstract class AbstractVehicle {
    protected int speedFactor() {
        return 5;
    }
}

class SUV extends AbstractVehicle{
 
}

class JEEP extends SUV{
	 
}

class Demo{
	public static void main(String ... args){
		JEEP jeep=new JEEP();
		System.out.println(jeep.speedFactor());
	}
}