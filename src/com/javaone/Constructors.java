package com.javaone;

public class Constructors {

    static void main() {

        Complex num1 = new Complex(2, 5);

        Complex num2 = new Complex(4, 1);

//        Complex num3 = new Complex(2);

        num1.print();
        num2.print();
//        num3.print();


        System.out.println("Adding two nums");
        Complex result = num1.add(num2);

        System.out.println(num1);

        result.print();



    }
}



class Complex {
    int a, b;

//    public Complex() {   //default
////        a = 5;
////        b = 9;
//        System.out.println("Creating a new object");
//    }


public Complex(int a, int b) {
   this.a = a;
    this.b = b;
}

public Complex(int real) {
    a = real;
    b = 12;

}



    void print() {
        System.out.println(a+" + "+b+"i");
    }



    Complex add(Complex num) {
        System.out.println(this);
       Complex newNum = new Complex(a+num.a, b+num.b);
       return newNum;

    }

}
