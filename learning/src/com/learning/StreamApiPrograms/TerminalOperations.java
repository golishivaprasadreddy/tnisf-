package com.learning.StreamApiPrograms;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // forEach
        numbers.stream().forEach(System.out::println);

        // collect
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // count
        long count = numbers.stream().filter(n -> n > 3).count();
        System.out.println("Numbers > 3: " + count);

        // reduce (sum)
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // anyMatch, allMatch
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All Even? " + allEven);
    }
}

/*
 * output
 * 
 * 1 2 3 4 5 6 Even Numbers: [2, 4, 6] Numbers > 3: 3 Sum: 21 All Even? false
 * 
 */