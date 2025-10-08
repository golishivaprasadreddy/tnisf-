//InterThreadCommunication

package com.learning.MultiTasking;



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
