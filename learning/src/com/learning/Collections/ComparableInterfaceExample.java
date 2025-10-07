package com.learning.Collections;

import java.util.*;

//Class Student implements Comparable interface
class Student implements Comparable<Student> {
 int id;
 String name;
 int age;

 // Constructor
 Student(int id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }

 // compareTo() defines the natural order (here by age)
 public int compareTo(Student other) {
     // Sort by age (ascending)
     if (this.age == other.age)
         return 0;
     else if (this.age > other.age)
         return 1;
     else
         return -1;
 }

 // To print student details nicely
 public String toString() {
     return id + " - " + name + " (" + age + ")";
 }
}

public class ComparableInterfaceExample {
 public static void main(String[] args) {
     // Create a list of students
     ArrayList<Student> list = new ArrayList<>();

     list.add(new Student(101, "John", 25));
     list.add(new Student(102, "Alice", 22));
     list.add(new Student(103, "Bob", 24));

     System.out.println("Before Sorting:");
     for (Student s : list)
         System.out.println(s);

     // Sort using Comparable (natural order)
     Collections.sort(list);

     System.out.println("\nAfter Sorting by Age:");
     for (Student s : list)
         System.out.println(s);
 }
}


//output
//
//Before Sorting:
//101 - John (25)
//102 - Alice (22)
//103 - Bob (24)
//
//After Sorting by Age:
//102 - Alice (22)
//103 - Bob (24)
//101 - John (25)

