package com.learning;

public class ArmstrongNUmber {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000 are:");

        for (int num = 1; num <= 1000; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        // count digits
        int digits = String.valueOf(num).length();

        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }
}

//output
//
//Armstrong numbers between 1 and 1000 are:
//1 2 3 4 5 6 7 8 9 153 370 371 407 
