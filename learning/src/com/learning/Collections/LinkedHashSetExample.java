package com.learning.Collections;

import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One"); // duplicate ignored

        System.out.println("LinkedHashSet (Insertion Order): " + set);

        set.remove("Two");
        System.out.println("After Removal: " + set);
    }
}


//output
//
//LinkedHashSet (Insertion Order): [One, Two, Three]
//After Removal: [One, Three]
