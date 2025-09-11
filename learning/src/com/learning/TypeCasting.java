package com.learning;

public class TypeCasting {

    public static void main(String[] args) {
        
        // Widening Casting (automatic)
        int intVal = 10;
        double doubleVal = intVal; // int → double
        long longVal = intVal;     // int → long
        float floatVal = intVal;   // int → float
        
        System.out.println("Widening Casting (Automatic):");
        System.out.println("int value: " + intVal);
        System.out.println("int → double: " + doubleVal);
        System.out.println("int → long: " + longVal);
        System.out.println("int → float: " + floatVal);

        // Narrowing Casting (manual)
        double d = 9.78;
        int i = (int) d;  // double → int
        char c = (char) i; // int → char

        System.out.println("\nNarrowing Casting (Manual):");
        System.out.println("double value: " + d);
        System.out.println("double → int: " + i);
        System.out.println("\nint → char: " + c);

        // Type Casting with characters
        char letter = 'A';  
        int ascii = letter;  // char → int (ASCII value)
        System.out.println("\nCharacter Casting:");
        System.out.println("char value: " + letter);
        System.out.println("char → int (ASCII): " + ascii);

        // Mixed example
        int x = 7;
        int y = 2;
        double result = (double) x / y; // type casting to get decimal result
        System.out.println("\nMixed Example:");
        System.out.println("Without casting: " + (x / y));   // integer division
        System.out.println("With casting: " + result);       // decimal division
    }
}

/** 
output 

Widening Casting (Automatic):
int value: 10
int → double: 10.0
int → long: 10
int → float: 10.0

Narrowing Casting (Manual):
double value: 9.78
double → int: 9

int → char: 	

Character Casting:
char value: A
char → int (ASCII): 65

Mixed Example:
Without casting: 3
With casting: 3.5

**/