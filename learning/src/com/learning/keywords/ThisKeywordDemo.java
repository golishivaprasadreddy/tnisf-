package com.learning.keywords;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;       // "this" refers to current object
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Shivaprasad");
        Employee e2 = new Employee(2, "Reddy");

        e1.display();
        e2.display();
    }
}


//output 
//
//1 Shivaprasad
//2 Reddy
