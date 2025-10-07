package com.learning.Collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // duplicate ignored

        System.out.println("Set Elements: " + colors);
    }
}

//
//output
//
//Set Elements: [Red, Blue, Green]
