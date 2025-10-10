package com.learning.oops;
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class EncapsulationDemo  {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("AC12345");
        account.setAccountHolder("Bob");

        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(600); // invalid, exceeds balance

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Final Balance: " + account.getBalance());
    }
}

/*
 * output
 * 
 * Deposited: 1000.0, New Balance: 1000.0 Withdrawn: 500.0, Remaining Balance:
 * 500.0 Invalid withdrawal amount. Account Number: AC12345 Account Holder: Bob
 * Final Balance: 500.0
 */