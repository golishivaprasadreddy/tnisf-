package com.learning.interfaceExample;

//First interface
interface Engine {
 void startEngine();
}

//Second interface
interface Horn {
 void blowHorn();
}

//Class implementing multiple interfaces
class Car implements Engine, Horn {
 public void startEngine() {
     System.out.println("Car engine started");
 }

 public void blowHorn() {
     System.out.println("Car horn is blowing");
 }
}

//Main class
public class MultipleInheritanceDemo {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.startEngine();
     myCar.blowHorn();
 }
}


//output
//
//Car engine started
//Car horn is blowing
