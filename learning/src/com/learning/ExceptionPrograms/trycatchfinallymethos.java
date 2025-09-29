package com.learning.ExceptionPrograms;


public class trycatchfinallymethos {
    public static void main(String[] args) {
        try {
            // Example: Division by zero (will throw ArithmeticException)
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }
        finally {
            System.out.println("Execution finished (finally block).");
        }
    }
}

//output
//Error: Cannot divide by zero!
//Execution finished (finally block).
