package com.javaone.oops;

public class MainClass {
    public static void main(String[] args) {

//        Dog d1 = new Dog();
//        d1.name = "Bruno";
//        d1.bark();
//        d1.walk();
//        Dog d2 = new Dog();
//        d2.name = "Leo";
//        d2.walk();


//        Complex num1 = new Complex();
//        num1.a = 3;
//        num1.b = 5;
//
//        num1.print();

    }
}

//
//class Complex {
//    int a;
//    int b;
//
//    void print() {
//        System.out.println(a+" + "+b+"i");
//    }
//
//}




class Dog {  // factory

    //properties
    String name;
    int age;
    String color;


    //behaviour

    void bark() {
        System.out.println(name+ " is barking");
    }

    void walk() {
        System.out.println(name+" is walking");
    }
}


