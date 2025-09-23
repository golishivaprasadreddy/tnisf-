package com.learning.keywords;

class Student {
    int rollNo;
    String name;
    static String college = "VIT"; // shared by all objects

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Goli");
        Student s2 = new Student(102, "Shiva");

        s1.display();
        s2.display();
    }
}


//output
//
//101 Goli VIT
//102 Shiva VIT
