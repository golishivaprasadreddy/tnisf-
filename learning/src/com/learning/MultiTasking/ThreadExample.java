//Multithreading using Thread class

package com.learning.MultiTasking;


class MyThread extends Thread {
 public void run() {
     for (int i = 1; i <= 3; i++)
         System.out.println("Running thread: " + Thread.currentThread().getName());
 }
}

public class ThreadExample {
 public static void main(String[] args) {
     MyThread t1 = new MyThread();
     MyThread t2 = new MyThread();
     t1.start();
     t2.start();
 }
}


//output
//
//Running thread: Thread-1
//Running thread: Thread-1
//Running thread: Thread-1
//Running thread: Thread-0
//Running thread: Thread-0
//Running thread: Thread-0
//
//
