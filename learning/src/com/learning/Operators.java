package com.learning;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 4;

        // Arithmetic Operators
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        float div = (float) a / b; // cast to get decimal result
        int mod = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + add);
        System.out.println("a - b = " + sub);
        System.out.println("a * b = " + mul);
        System.out.println("a / b = " + div);
        System.out.println("a % b = " + mod);

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 5;
        System.out.println("c = " + c);
        c += 2;
        System.out.println("c += 2 → " + c);
        c -= 2;
        System.out.println("c -= 2 → " + c);
        c *= 2;
        System.out.println("c *= 2 → " + c);
        c /= 2;
        System.out.println("c /= 2 → " + c);
        c %= 2;
        System.out.println("c %= 2 → " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int u = 5;
        System.out.println("u = " + u);
        System.out.println("++u = " + (++u)); // pre-increment
        System.out.println("u++ = " + (u++)); // post-increment
        System.out.println("After u++ = " + u);
        System.out.println("--u = " + (--u)); // pre-decrement
        System.out.println("u-- = " + (u--)); // post-decrement
        System.out.println("After u-- = " + u);
        System.out.println("-u = " + (-u));

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);
    }
}
 /** 
   output
  
Arithmetic Operators:
a + b = 14
a - b = 6
a * b = 40
a / b = 2.5
a % b = 2

Relational Operators:
a == b: false
a != b: true
a > b: true
a < b: false
a >= b: true
a <= b: false

Logical Operators:
x && y: false
x || y: true
!x: false

Bitwise Operators:
a & b = 0
a | b = 14
a ^ b = 14
~a = -11
a << 1 = 20
a >> 1 = 5
a >>> 1 = 5

Assignment Operators:
c = 5
c += 2 → 7
c -= 2 → 5
c *= 2 → 10
c /= 2 → 5
c %= 2 → 1

Unary Operators:
u = 5
++u = 6
u++ = 6
After u++ = 7
--u = 6
u-- = 6
After u-- = 5
-u = -5

Ternary Operator:
Max of a and b = 10

**/
