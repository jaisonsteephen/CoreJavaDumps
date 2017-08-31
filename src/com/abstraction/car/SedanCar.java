package com.abstraction.car;

import com.abstraction.vehicle.AbstractVehicle;

public class SedanCar extends AbstractVehicle {
    public static void main(String[] args) {
        SedanCar sedan = new SedanCar();
        sedan.speedFactor();
        AbstractVehicle vehicle = new SedanCar();
      //  vehicle.speedFactor();
    }
}