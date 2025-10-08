package com.learning.MultiTasking;

public class Consumer extends Thread {
	 Shared s;
	 Consumer(Shared s) { this.s = s; }
	 public void run() {
	     int i = 0;
	     while (i < 5) s.get();
	 }
	}

