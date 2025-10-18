package com.javaone;

 public class oops {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Sheru";

        d1.color = "Brown";
        d1.age = 5;
        d1.bark();
        d1.walk();

     Dog d2 = new Dog();
     d2.name = "Joy";
     d2.walk();



    }
}


class Dog {  //  factory

     String name;
     int age;
     String color;


     void walk(){
         System.out.println( name + " is walking");
     }


     void bark() {
         System.out.println(name + " is barking");
     }


}


class Cat {



}
