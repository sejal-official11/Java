package com.javaone.oops5;


import org.w3c.dom.ls.LSOutput;

class Data{
    int data;

    public void printData() {
        System.out.println(data);
    }

    public void printData(int times) {
        for(int i = 0;i < times; i++) {
            System.out.println(i);
        }
    }
}


class ChildData extends Data{
 @Override
    public void printData() {
     System.out.println("overridden " + data);
 }


}
public class LearnPolymorphism {

    public static void main() {
//        int a = 5;
//        Data obj = new Data();
//        obj.data = 5;
//        changeValue(a, obj);
//        System.out.println(a);
//        System.out.println(obj.data);
        Data d;
        d = new ChildData();
        d.printData();
        d.printData(10);
    }
    
    //    static void changeValue(int a, Data obj) {

//        a = 10;
//        obj.data = 100;
//    }
}


