package com.learning.oops;

class Employee {
    public void work() {
        System.out.println("Employee is working...");
    }

    public void salary() {
        System.out.println("Employee has a basic salary.");
    }
}

class Manager extends Employee {
    @Override
    public void salary() {
        System.out.println("Manager has a higher salary with bonus.");
    }

    @Override
    public void work() {
        System.out.println("Manager is managing the team.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        emp.salary();

        Manager mgr = new Manager();
        mgr.work();
        mgr.salary();

        Employee emp2 = new Manager();
        emp2.work();
        emp2.salary();
    }
}


/*
 * output
 * 
 * Employee is working... Employee has a basic salary. Manager is managing the
 * team. Manager has a higher salary with bonus. Manager is managing the team.
 * Manager has a higher salary with bonus.
 */