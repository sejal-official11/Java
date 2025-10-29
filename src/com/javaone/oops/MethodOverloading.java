package com.javaone.oops;

public class MethodOverloading {
    public static void main(String[] args) {

        Greet obj = new Greet();
//        obj.greetings();
//        obj.greetings("Sejal");
        obj.greetings("Sejal", 10);


    }
}


class Greet{

    int name;
    void greetings() {
        System.out.println("Hello Good Morning");
    }

    void greetings(String name) {
        System.out.println("Hello "+name+", Good Morning");
    }

    void greetings(String name, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println("Hello "+name+", Good Morning");
        }

    }

}
