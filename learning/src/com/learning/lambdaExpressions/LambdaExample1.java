package com.learning.lambdaExpressions;



public class LambdaExample1 {
    public static void main(String[] args) {
        Runnable greet = () -> System.out.println("Hello from Lambda Expression!");
        greet.run();
    }
}


/*
 * output
 * 
 * Hello from Lambda Expression!
 */