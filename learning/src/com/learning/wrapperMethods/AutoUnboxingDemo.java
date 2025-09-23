package com.learning.wrapperMethods;

public class AutoUnboxingDemo {
    public static void main(String[] args) {
        // Wrapper objects
        Integer aObj = Integer.valueOf(100);
        Character cObj = Character.valueOf('Y');
        Double dObj = Double.valueOf(55.5);

        // Auto-unboxing: compiler automatically converts wrapper → primitive
        int a = aObj;
        char c = cObj;
        double d = dObj;

        System.out.println("Auto-unboxing:");
        System.out.println("int value: " + a);
        System.out.println("char value: " + c);
        System.out.println("double value: " + d);
    }
}