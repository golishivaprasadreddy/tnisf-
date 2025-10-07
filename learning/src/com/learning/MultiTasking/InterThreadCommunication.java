//InterThreadCommunication

package com.learning.MultiTasking;

class Shared {
 int num;
 boolean valueSet = false;

 synchronized void put(int n) {
     while (valueSet) {
         try { wait(); } catch (Exception e) {}
     }
     System.out.println("Put: " + n);
     num = n;
     valueSet = true;
     notify();
 }

 synchronized int get() {
     while (!valueSet) {
         try { wait(); } catch (Exception e) {}
     }
     System.out.println("Got: " + num);
     valueSet = false;
     notify();
     return num;
 }
}

class Producer extends Thread {
 Shared s;
 Producer(Shared s) { this.s = s; }
 public void run() {
     int i = 0;
     while (i < 5) s.put(i++);
 }
}

class Consumer extends Thread {
 Shared s;
 Consumer(Shared s) { this.s = s; }
 public void run() {
     int i = 0;
     while (i < 5) s.get();
 }
}

public class InterThreadCommunication {
 public static void main(String[] args) {
     Shared s = new Shared();
     new Producer(s).start();
     new Consumer(s).start();
 }
}



//output
//
//Put: 0
//Got: 0
//Put: 1
//Got: 1
//Put: 2
//Got: 2
//Put: 3
//Got: 3
//Put: 4
//Got: 4
