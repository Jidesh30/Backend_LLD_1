package org.example.demo;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    public String ownerName;
    public double balance;
    public List<String> transactionHistory;

    public BankAccount(){
        this.ownerName = "Unknown";
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(ownerName + " deposited " + amount + ". New balance: " + balance);
            String depositTrans = ownerName + " deposited " + amount + ". New balance: " + balance;
            transactionHistory.add(depositTrans);
        } else {
            System.out.println("Invalid deposit amount for " + ownerName);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(ownerName + " withdrew " + amount + ". New balance: " + balance);
            String withdrawTrans = ownerName + " withdrew " + amount + ". New balance: " + balance;
            transactionHistory.add(withdrawTrans);
        } else {
            System.out.println("Insufficient funds or invalid amount for " + ownerName);
        }
    }

    public void showBal(){
        System.out.println(ownerName +"'s current balance: " + balance);
    }

    public void printTransaction(){
        for (String trans : transactionHistory) {
            System.out.println(trans);
        }
    }

}
