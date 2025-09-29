package com.learning.ExceptionPrograms;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            // Outer try block
            int arr[] = {1, 2, 3};

            try {
                // Inner try block
                int result = arr[2] / 0;  // ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("⚠ Inner Catch: Division by zero not allowed.");
            }

            // Accessing invalid array index
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ Outer Catch: Invalid array index.");
        }

        System.out.println("✅ Program continues...");
    }
}

//output
//
//⚠ Inner Catch: Division by zero not allowed.
//⚠ Outer Catch: Invalid array index.
//✅ Program continues...
