package com.learning.keywords;


class Vehicle {
 final int wheels = 4; // constant value

 final void displayType() {
     System.out.println("This is a vehicle");
 }
}

//Cannot extend because Vehicle is final
class Car extends Vehicle {
 // ❌ This would cause error because displayType() is final
 // void displayType() {}
}

public class FinalKeywordDemo {
 public static void main(String[] args) {
     Vehicle v = new Vehicle();
     System.out.println("Wheels: " + v.wheels);
     v.displayType();
 }
}

