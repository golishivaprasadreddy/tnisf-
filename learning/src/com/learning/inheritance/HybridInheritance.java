package com.learning.inheritance;


//Base class
class Person {
void display() {
   System.out.println("I am a Person.");
}
}

//Intermediate class 1 (Single inheritance)
class Student extends Person {
void study() {
   System.out.println("I study subjects.");
}
}

//Intermediate class 2 (Single inheritance)
class Athlete extends Person {
void play() {
   System.out.println("I play football.");
}
}

//Derived class combining features (via composition)
class SchoolBoy {
Student studentPart = new Student();
Athlete athletePart = new Athlete();

void display() {
   studentPart.display(); // Person part
}

void study() {
   studentPart.study();
}

void play() {
   athletePart.play();
}
}

public class HybridInheritance {
public static void main(String[] args) {
   SchoolBoy sb = new SchoolBoy();
   sb.display(); 
   sb.study();  
   sb.play();   
}
}


//output 

//I am a Person.
//I study subjects.
//I play football.
