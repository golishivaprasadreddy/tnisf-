package com.learning.controlStatements;



public class jumpStatement {

    public static void main(String[] args) {
        
        // 1. BREAK example
        System.out.print("BREAK example: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // exits loop when i == 6
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. CONTINUE example
        System.out.print("CONTINUE example: ");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue; // skips the rest of this iteration
            }
            System.out.print(j + " ");
        }
        System.out.println();
    }
}


//sample output
//
//BREAK example: 1 2 3 4 5 
//CONTINUE example: 1 2 4 5 
//

