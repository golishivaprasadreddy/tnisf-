package com.learning.wrapperMethods;


public class AutoBoxingDemo {
    public static void main(String[] args) {
        // Primitives
        int a = 10;
        char c = 'X';
        double d = 25.5;

        // Autoboxing: compiler automatically converts primitive → wrapper
        Integer aObj = a;
        Character cObj = c;
        Double dObj = d;

        System.out.println("Autoboxing:");
        System.out.println("Integer object: " + aObj);
        System.out.println("Character object: " + cObj);
        System.out.println("Double object: " + dObj);
    }
}


//output 
//
//Autoboxing:
//Integer object: 10
//Character object: X
//Double object: 25.5
