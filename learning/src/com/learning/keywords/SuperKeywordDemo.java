package com.learning.keywords;

class Animal {
    String color = "White";

    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println("Dog color: " + color);       // child variable
        System.out.println("Animal color: " + super.color); // parent variable
    }

    void eat() {
        System.out.println("Dog is eating...");
        super.eat(); // calls parent method
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
        d.eat();
    }
}


//output 
//
//Dog color: Black
//Animal color: White
//Dog is eating...
//Animal is eating...
