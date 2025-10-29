package com.javaone.oops;

public class Constructors {
    public static void main() {

        Complex num1 = new Complex(2,3);
        Complex num2 = new Complex(4);

        num1.print();
//        num2.print();
        System.out.println(num1);
        Complex result = num2.add(num1);
        result.print();

    }
}

class Complex {
    int a;
    int b;

//    public Complex() {
//       a = 7;
//       b = 2;
//        System.out.println("Creating a new object");
//    }
public Complex(int real) {
    a = real;
    b = 32;
}


    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }

    Complex add(Complex num2) {
    this.print();

    Complex newNum = new Complex(a+num2.a, b+num2.b);
        System.out.println(this);
    return newNum;
    }

}
