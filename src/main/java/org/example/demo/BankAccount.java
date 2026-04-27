package org.example.demo;

public class BankAccount {
    public String ownerName;
    public double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        System.out.println(ownerName + " deposited " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficent funds for " + ownerName);
        }
        System.out.println(ownerName + " withdrew " + amount + ". New balance: " + balance);
    }

    public void showBal(){
        System.out.println(ownerName +"'s current balance: " + balance);
    }
}
