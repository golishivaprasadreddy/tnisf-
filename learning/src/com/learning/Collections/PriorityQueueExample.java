package com.learning.Collections;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        System.out.println("PriorityQueue Elements: " + pq);
        System.out.println("Peek (smallest element): " + pq.peek());

        pq.poll(); // removes head (smallest)
        System.out.println("After Poll: " + pq);

        // Descending order queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.addAll(Arrays.asList(10, 20, 5, 15));
        System.out.println("Max PriorityQueue: " + maxPQ);
    }
}



//output
//
//PriorityQueue Elements: [10, 20, 50, 30]
//Peek (smallest element): 10
//After Poll: [20, 30, 50]
//Max PriorityQueue: [20, 15, 5, 10]
