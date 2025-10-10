package com.learning;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Must be between 0 and 100.");
        }
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class GetterSetterDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        s.setName("Alice");
        s.setMarks(95);

        s.display();

        s.setMarks(120); // Invalid marks
        System.out.println("Updated Marks: " + s.getMarks());
    }
}

/*
 * output
 * 
 * Roll No: 101, Name: Alice, Marks: 95.0 Invalid marks. Must be between 0 and
 * 100. Updated Marks: 95.0
 */

