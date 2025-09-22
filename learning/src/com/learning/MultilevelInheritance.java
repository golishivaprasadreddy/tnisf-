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

class Puppy extends Dog {
    void weep() {
        System.out.println("I am a puppy, I can weep.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   
        p.bark();  
        p.weep();  
    }
}



//output 
//
//I can eat.
//I can bark.
//I am a puppy, I can weep.


