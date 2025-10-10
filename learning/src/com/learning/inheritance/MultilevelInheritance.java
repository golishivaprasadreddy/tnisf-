package com.learning.inheritance;


class Animals1 {
    void eat() {
        System.out.println("I can eat.");
    }
}

class Dogs extends Animals1 {
    void bark() {
        System.out.println("I can bark.");
    }
}

class Puppy extends Dogs {
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


