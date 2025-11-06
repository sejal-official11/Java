package com.javaone.oops4;

public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sing();
        System.out.println(monkey.legs);
//        monkey.legs = 3;   cannot be reassign
    }
}

interface Human{
    void sing();


    void drinks();
}


interface Animal{
//    public abstract void eats();
//public static final int legs = 4;
int legs = 4;

     void eats();

     void drinks();

     default void walk(){
         System.out.println("Animal is walking");
     }


}


class Monkey implements Animal, Human{
    public void eats() {
        System.out.println("Monkey is eating banana");
    }

    public void sing(){
        System.out.println("Humans can sing song");
    }

    public void drinks(){
        System.out.println("Monkey is drinking");
    }
}



