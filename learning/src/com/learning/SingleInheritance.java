package com.learning;


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

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // from Animal
        d.bark(); // from Dog
    }
}

//
//output 
//
//I can eat.
//I can bark.
//
//
