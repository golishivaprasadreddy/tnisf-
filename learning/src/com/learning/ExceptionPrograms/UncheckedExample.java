package com.learning.ExceptionPrograms;

public class UncheckedExample {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int result = a / b;   // ArithmeticException at runtime
        System.out.println("Result: " + result);
    }
}


//output
//
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at learning/ExceptionPrograms.UncheckedExample.main(UncheckedExample.java:6)


//Unchecked Exceptions include:
//
//ArithmeticException
//
//NullPointerException
//
//ArrayIndexOutOfBoundsException
//
//StringIndexOutOfBoundsException
//
//NumberFormatException
//
//IllegalArgumentException
//
//IllegalStateException
//
//ClassCastException
//
//UnsupportedOperationException
//
//ConcurrentModificationException