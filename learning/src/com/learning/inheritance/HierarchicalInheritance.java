package com.learning.inheritance;

class Animal {
    void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("I can bark.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("I can meow.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat(); d.bark();
        c.eat(); c.meow();
    }
}


//output 
//
//I can eat.
//I can bark.
//I can eat.
//I can meow.

