package com.javaone.oops2;

import com.javaone.oops3.learnPackage.Teacher;

public class Teacher2 extends Teacher {

//    public int studentCount = 40;


    static void main() {
        Teacher t1 = new Teacher();
        Teacher2 teacher = new Teacher2();
        teacher.studentCount = 40;

    }

}
