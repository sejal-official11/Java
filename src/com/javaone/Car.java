package com.javaone;

public class Car extends Vehicle{

    String color;


    Car() {
        super(6);
        System.out.println("Car is being created");
    }


    Car(int wheelsCount) {
        
    }




    void start() {
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        super.start();
        System.out.println(this.model);
        System.out.println(this.model + " car is staring");

    }

    Car braking() {
        return this;
    }

    static void main() {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.model = "I10";
        obj.color = "Red";
        obj.start();
        System.out.println(obj.wheelsCount);

    }
}



class Scooter {

    void braking(Car car) {
        System.out.println(car.model + " is braking");
    }
}
