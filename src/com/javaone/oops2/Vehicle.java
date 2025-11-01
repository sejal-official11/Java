package com.javaone.oops2;

public class Vehicle {

    int wheelsCount;
    String model;


    Vehicle() {
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with " + this.wheelsCount + " wheels");
    }

    void start() {
        System.out.println("Vehicle is starting");
    }

}
