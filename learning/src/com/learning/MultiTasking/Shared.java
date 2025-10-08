package com.learning.MultiTasking;
public class Shared {
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