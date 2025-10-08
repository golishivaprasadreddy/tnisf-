package com.learning.StreamApiPrograms;


import java.util.Arrays;
import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Kiran", "Kiran", "Anu", "Bhanu", "Sita");

        names.stream()
                .filter(name -> name.startsWith("K"))    // Filter
                .distinct()                              // Remove duplicates
                .map(String::toUpperCase)                // Convert to uppercase
                .sorted()                                // Sort alphabetically
                .limit(2)                                // Take first 2
                .forEach(System.out::println);
    }
}

/*
 * output
 * 
 * KIRAN
 */
