package com.javaone.oops2;

public class Car extends Vehicle{

    String color;

    void start() {

        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);

        super.start();
        System.out.println(this);
        System.out.println(this.model +" car is starting");

    }


    Car braking() {
        return this;
    }

    Car() {
        super(2);
        System.out.println("Car is being created");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.wheelsCount);
        obj.wheelsCount = 4;
        obj.model = "I10";
        obj.color = "Blue";
        obj.start();

        System.out.println(obj.wheelsCount);


    }
}



class Scooter {
    void braking(Car car) {
        System.out.println(car.model+ " is braking");
    }
}
