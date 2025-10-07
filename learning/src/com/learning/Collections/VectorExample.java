package com.learning.Collections;
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(20); // duplicates allowed

        System.out.println("Vector Elements: " + vector);

        vector.remove(1);
        System.out.println("After Removing index 1: " + vector);

        System.out.println("Element at index 1: " + vector.get(1));
        System.out.println("Capacity: " + vector.capacity());
    }
}

//output
//
//Vector Elements: [10, 20, 30, 20]
//After Removing index 1: [10, 30, 20]
//Element at index 1: 30
//Capacity: 10
