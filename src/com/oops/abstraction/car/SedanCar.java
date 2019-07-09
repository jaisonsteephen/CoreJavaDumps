package com.oops.abstraction.car;

import com.oops.abstraction.vehicle.AbstractVehicle;

public class SedanCar extends AbstractVehicle {
    public static void main(String[] args) {
        SedanCar sedan = new SedanCar();
        sedan.speedFactor();
        AbstractVehicle vehicle = new SedanCar();
      //  vehicle.speedFactor();
    }
}