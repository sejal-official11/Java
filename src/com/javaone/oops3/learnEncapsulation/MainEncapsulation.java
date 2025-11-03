
package com.javaone.oops3.learnEncapsulation;

import com.javaone.oops3.learnPackage.Person;

public class MainEncapsulation {
//    public static void printHello() {
//        System.out.println("Hello");
//    }
//    public void printHi(){
//        System.out.println("Hi");


//    }

    public static final String scientifcName = "Home Sapiens";

    static{
        System.out.println("I am going to be the first because i am static");
    }

    public static void main(String[] args){
        System.out.println("From the main method");
        Person p1 = new Person();
        p1.setAge(12);
//        System.out.println(p1.getAge());
        Person p2 = new Person();
        Person p3 = new Person();
        System.out.println(Person.count);

//        printHello();

//        MainEncapsulation me = new MainEncapsulation();
//        me.printHi();
    }

    static{
        System.out.println("Call form the second static block");
    }

}
