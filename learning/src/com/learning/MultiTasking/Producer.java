package com.learning.MultiTasking;

public class Producer extends Thread {
	 Shared s;
	 Producer(Shared s) { this.s = s; }
	 public void run() {
	     int i = 0;
	     while (i < 5) s.put(i++);
	 }
}
