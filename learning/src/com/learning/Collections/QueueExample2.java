package com.learning.Collections;

import java.util.*;

public class QueueExample2 {
    public static void main(String[] args) {

        // Create a Queue using LinkedList implementation
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue (FIFO - First In, First Out)
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("Initial Queue: " + queue);

        // Peek: retrieves head (front) without removing
        System.out.println("Head of Queue (peek): " + queue.peek());

        // Poll: retrieves and removes head of the queue
        System.out.println("Removed Element (poll): " + queue.poll());

        System.out.println("Queue after poll(): " + queue);

        // Offer: adds element to the queue (returns false if fails)
        queue.offer("Task4");
        System.out.println("After offer(Task4): " + queue);

        // Iterate through elements
        System.out.println("Iterating Queue:");
        for (String task : queue) {
            System.out.println(" - " + task);
        }

        // Remove all elements
        queue.clear();
        System.out.println("Queue after clear(): " + queue);
    }
}


//output
//
//Initial Queue: [Task1, Task2, Task3]
//Head of Queue (peek): Task1
//Removed Element (poll): Task1
//Queue after poll(): [Task2, Task3]
//After offer(Task4): [Task2, Task3, Task4]
//Iterating Queue:
// - Task2
// - Task3
// - Task4
//Queue after clear(): []
