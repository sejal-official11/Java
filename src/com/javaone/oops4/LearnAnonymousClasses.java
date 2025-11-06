package com.javaone.oops4;

public class LearnAnonymousClasses {
    //    class InnerClass extends OuterClass{}

    OuterClass obj = new OuterClass(){  // anonymous class
        void sing(){

        }

        public void outerMethod(){

        }

    };


    SuperInterface obj2 = new SuperInterface(){
        public void interfaceMethod(){

        }

    };

    SuperInterface obj3 = () -> {

    };





    static void main() {
        WalkAble walkable = (int steps) -> {
            System.out.println("Walked " + steps + " steps");

            return steps;
        };


        walkable.walks(5);
        WalkAble obj2 = (int steps) -> 2*steps;
        System.out.println(obj2.walks(16));

    }

}


interface WalkAble {
    int walks(int steps);
}

@FunctionalInterface
interface SuperInterface {
    void interfaceMethod();
}



class OuterClass {

    public void outerMethod(){

    }
}





