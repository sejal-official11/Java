package com.javaone.oops3.learnPackage;

public class Teacher {

    public int teachingClass;

    private int id;
     String degree;   // default for package private
    protected int studentCount;

    static void main() {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        obj.id = 333;
        obj.degree = "PHD";
        System.out.println(obj.studentCount);

    }
}
