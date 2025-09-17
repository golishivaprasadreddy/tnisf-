package com.learning;

public class loopsStatement {

    public static void main(String[] args) {
        
        // 1. FOR loop
        System.out.print("FOR loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. WHILE loop
        System.out.print("WHILE loop: ");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // 3. DO-WHILE loop
        System.out.print("DO-WHILE loop: ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
        System.out.println();

        // 4. FOR-EACH loop
        System.out.print("FOR-EACH loop: ");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

//sample output
//
//FOR loop: 1 2 3 4 5 
//WHILE loop: 1 2 3 4 5 
//DO-WHILE loop: 1 2 3 4 5 
//FOR-EACH loop: 10 20 30 40 50 
//
