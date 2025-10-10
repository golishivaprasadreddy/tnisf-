package com.learning.oops;

//Abstract class
abstract class Payment {
 protected double amount;

 public Payment(double amount) {
     this.amount = amount;
 }

 public abstract void pay();  // abstract method

 public void showAmount() {   // concrete method
     System.out.println("Amount to pay: " + amount);
 }
}

//Subclass for Credit Card payment
class CreditCardPayment extends Payment {

 private String cardNumber;

 public CreditCardPayment(double amount, String cardNumber) {
     super(amount);
     this.cardNumber = cardNumber;
 }

 @Override
 public void pay() {
     System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
 }
}

//Subclass for PayPal payment
class PayPalPayment extends Payment {

 private String email;

 public PayPalPayment(double amount, String email) {
     super(amount);
     this.email = email;
 }

 @Override
 public void pay() {
     System.out.println("Paid " + amount + " using PayPal account: " + email);
 }
}

//Main class
public class AbstractionDemo {
 public static void main(String[] args) {
     Payment p1 = new CreditCardPayment(1000, "1234-5678-9876-5432");
     p1.showAmount();
     p1.pay();

     Payment p2 = new PayPalPayment(500, "bob@example.com");
     p2.showAmount();
     p2.pay();
 }
}

/*
 * output
 * 
 * Amount to pay: 1000.0 Paid 1000.0 using Credit Card: 1234-5678-9876-5432
 * Amount to pay: 500.0 Paid 500.0 using PayPal account: bob@example.com
 * 
 */