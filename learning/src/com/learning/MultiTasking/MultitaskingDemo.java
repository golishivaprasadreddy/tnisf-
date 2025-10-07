
//Multitasking means performing multiple tasks simultaneously. In Java, it can be done using:
//
//Thread-based multitasking
//
//Process-based multitasking

package com.learning.MultiTasking;

class Task1 extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++)
         System.out.println("Task 1 - Count: " + i);
 }
}

class Task2 extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++)
         System.out.println("Task 2 - Count: " + i);
 }
}

public class MultitaskingDemo {
 public static void main(String[] args) {
     Task1 t1 = new Task1();
     Task2 t2 = new Task2();
     t1.start();
     t2.start();
 }
}

//output

//Task 1 - Count: 1
//Task 1 - Count: 2
//Task 1 - Count: 3
//Task 1 - Count: 4
//Task 1 - Count: 5
//Task 2 - Count: 1
//Task 2 - Count: 2
//Task 2 - Count: 3
//Task 2 - Count: 4
//Task 2 - Count: 5
