package com.javaone.oops3.learnPackage;

import com.javaone.oops3.learnEncapsulation.MainEncapsulation;

public class Person {
    public static int count = 0;
   public Person() {
       count++;
   }


        private int age;
        private String name;

        boolean canBeChanged = true;

        public void setAge(int age) {
            if(canBeChanged)  {
                if(age > 0) {
                    this.age = age;
                }
            }
        }

        boolean canBeAccessed = false;

        public int getAge() {
          if(canBeAccessed)
            return age;
          else return -1;
        }

    public static void main(String[] args) {
//        System.out.println(Person.count);
//        MainEncapsulation.printHello();

    }




}
