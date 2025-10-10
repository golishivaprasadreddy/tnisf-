package com.learning.oops;


class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));      
        System.out.println(calc.add(3.5, 2.5));  
    }
}



//output 
//
//15
//6.0
