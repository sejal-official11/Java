package com.javaone.oops4;

public class LearnAbstarct {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(4);
        c1.honks();

    }
}


abstract class Vehicle{

    abstract void accelerate();
    abstract int brakes(int wheels);


    void honks(){
        System.out.println("Vehicle honks");
    }


}


class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Car is accelerating");
    }



    @Override
    int brakes(int wheels) {
        System.out.println("Car brakes are pushed");
       return wheels;
    }


    void honks(){
        System.out.println("Car is honked");
    }
}


abstract class Bus extends Vehicle{
    int a;
    int b;
    int returnSum(int a, int b) {
        return a + b;
    }

    void accelerate(){
        System.out.println("Bus is accelerating");
    }


    int brakes(int wheels) {
        return wheels;
    }
}


class Scooter extends Vehicle {


    void accelerate() {
        System.out.println("Scooter is accelrating");

    }


    int brakes(int wheels) {
        return wheels;
    }
}