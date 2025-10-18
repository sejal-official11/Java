package com.javaone;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");

//        int a = 1;
//        byte b = 1;
//        short c = 4;
//        long d = 9223372036854775807l;
//        System.out.println(d);

//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//
//        double e = 12345.876599999999999999999999f;
//        System.out.println(e);


//        boolean flag = true;

//        System.out.println("Hello World");
//        char a = 'g';
//        System.out.println(a);




        Test test = new Test();

//        String s1 = "Hello"; //literals
//        String s2 = new String("Hello");  // using constructor
        //jvm --> heap

//        String str2 = "Hello";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        String b = s2.toUpperCase();
//        System.out.println(s2.length());


//        int a = 9;
//        System.out.println(Integer.toBinaryString(a));

        int[] a = new int[7];
        for(int i = 0; i < 7; i++ ) {
            a[i] = i;
        }


//        for(int i = 0; i < 7; i++ ) {
//            System.out.println(a[i]);
//        }


        for(int it : a) {
            System.out.println(it);
        }


        int[] val = {1, 2, 3, 4, 5};
        System.out.println(val);












    }
}
