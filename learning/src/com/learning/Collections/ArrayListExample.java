package com.learning.Collections;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Collection interface (using ArrayList as implementation)
        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Collection Elements: " + fruits);

        fruits.remove("Banana");
        System.out.println("After Removal: " + fruits);

        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Size: " + fruits.size());
    }
}

//output
//
//Collection Elements: [Apple, Banana, Cherry]
//After Removal: [Apple, Cherry]
//Contains Apple? true
//Size: 2