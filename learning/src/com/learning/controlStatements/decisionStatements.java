package com.learning.controlStatements;


import java.util.Scanner;

public class decisionStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example 1: if statement
        System.out.print("Enter a number for IF example: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("IF: " + number + " is positive.");
        }

        // Example 2: if-else statement
        System.out.print("\nEnter a number for IF-ELSE example: ");
        int number2 = sc.nextInt();
        if (number2 >= 0) {
            System.out.println("IF-ELSE: " + number2 + " is non-negative.");
        } else {
            System.out.println("IF-ELSE: " + number2 + " is negative.");
        }

        // Example 3: if-else-if ladder
        System.out.print("\nEnter your marks for IF-ELSE-IF example: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("IF-ELSE-IF: Grade A");
        } else if (marks >= 75) {
            System.out.println("IF-ELSE-IF: Grade B");
        } else if (marks >= 50) {
            System.out.println("IF-ELSE-IF: Grade C");
        } else {
            System.out.println("IF-ELSE-IF: Grade F");
        }

        // Example 4: switch statement
        System.out.print("\nEnter a number (1-7) for SWITCH example: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("SWITCH: Monday");
                break;
            case 2:
                System.out.println("SWITCH: Tuesday");
                break;
            case 3:
                System.out.println("SWITCH: Wednesday");
                break;
            case 4:
                System.out.println("SWITCH: Thursday");
                break;
            case 5:
                System.out.println("SWITCH: Friday");
                break;
            case 6:
                System.out.println("SWITCH: Saturday");
                break;
            case 7:
                System.out.println("SWITCH: Sunday");
                break;
            default:
                System.out.println("SWITCH: Invalid day");
        }

        sc.close();
    }
}

//
//sample output 
//
//Enter a number for IF example: 2
//IF: 2 is positive.
//
//Enter a number for IF-ELSE example: 3
//IF-ELSE: 3 is non-negative.
//
//Enter your marks for IF-ELSE-IF example: 4
//IF-ELSE-IF: Grade F
//
//Enter a number (1-7) for SWITCH example: 5
//SWITCH: Friday
//
