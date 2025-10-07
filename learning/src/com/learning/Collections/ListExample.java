package com.learning.Collections;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // duplicates allowed
        numbers.add(30);

        System.out.println("List Elements: " + numbers);
        System.out.println("Element at index 1: " + numbers.get(1));

        numbers.set(2, 25);
        System.out.println("After set(2,25): " + numbers);
    }
}


//output
//List Elements: [10, 20, 10, 30]
//Element at index 1: 20
//After set(2,25): [10, 20, 25, 30]
