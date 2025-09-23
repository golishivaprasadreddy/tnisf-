package com.learning.interfaceExample;

interface Animal {
    void sound();  // abstract method
    void sleep();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sleep();
    }
}


//output 
//
//Dog barks
//Dog sleeps
