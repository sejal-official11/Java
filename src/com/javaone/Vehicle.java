package com.javaone;

public class Vehicle {

    final int gears = 4;

    static void main() {
       Vehicle v1 = new Vehicle(2);
//       v1.gears = 6;
    }


    int wheelsCount;
    String model;



    Vehicle() {
        System.out.println("Creating an instance of vehicle");
    }


    Vehicle(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("Creating wheels of the vehicle: " + this.wheelsCount);
    }

    void start() {
        System.out.println("Vehicle is Starting");
    }


    final void accelerate() {
        System.out.println("Vehicle is accelerating");
    }


}
