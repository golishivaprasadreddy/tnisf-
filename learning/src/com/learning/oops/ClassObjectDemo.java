package com.learning.oops;


//Define a class
class Car {
 // Data members (fields / attributes)
 String brand;
 String color;
 int speed;

 // Method to display car details
 void displayDetails() {
     System.out.println("Brand: " + brand + ", Color: " + color + ", Speed: " + speed + " km/h");
 }

 // Method to accelerate the car
 void accelerate(int increment) {
     speed += increment;
     System.out.println(brand + " accelerated. New speed: " + speed + " km/h");
 }
}

//Main class
public class ClassObjectDemo {
 public static void main(String[] args) {
     // Create first object
     Car car1 = new Car();
     car1.brand = "Tesla";
     car1.color = "Red";
     car1.speed = 100;

     // Create second object
     Car car2 = new Car();
     car2.brand = "BMW";
     car2.color = "Black";
     car2.speed = 120;

     // Use methods
     car1.displayDetails();
     car1.accelerate(30);

     car2.displayDetails();
     car2.accelerate(20);
 }
}


//sample output
//
//Brand: Tesla, Color: Red, Speed: 100 km/h
//Tesla accelerated. New speed: 130 km/h
//Brand: BMW, Color: Black, Speed: 120 km/h
//BMW accelerated. New speed: 140 km/h
