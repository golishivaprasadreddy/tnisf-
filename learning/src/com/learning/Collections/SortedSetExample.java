package com.learning.Collections;

import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> names = new TreeSet<>();

        names.add("Zara");
        names.add("Bob");
        names.add("Alice");

        System.out.println("SortedSet (ascending order): " + names);
        System.out.println("First: " + names.first());
        System.out.println("Last: " + names.last());
    }
}


//output
//
//Set Elements: [Red, Blue, Green]
