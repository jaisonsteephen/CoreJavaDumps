package com.oops.abstraction;


 abstract class AbstractVehicle {
    protected int speedFactor() {
        return 5;
    }
}

class SUV extends AbstractVehicle{
 
}

class JEEP extends SUV{
	 
}
class KL7 extends JEEP{
	 
}
public class Demo {
public static void main(String ... args){
	KL7 reg=new KL7();
	System.out.println(reg.speedFactor());
}
}
