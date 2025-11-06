package com.javaone.oops4;

public class LearnInnerClass {
    class Toy {
        int price;
    }


    static class PlayStation{

        int price;

    }

     static void main() {

        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();

//        Toy toy = new LearnInnerClass(). new Toy();

//         static class

         PlayStation playstation = new LearnInnerClass.PlayStation();
    }
}
