package com.javaone.oops2;

public class Vehicle {

    int wheelsCount;
    String model;
    final int gears = 4;

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
    }

    Vehicle(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with " + this.wheelsCount + " wheels");
    }

    void start() {
        System.out.println("Vehicle is starting");
    }

    void accelerate() {
        System.out.println("Vehicle is accelerating");
    }
}



