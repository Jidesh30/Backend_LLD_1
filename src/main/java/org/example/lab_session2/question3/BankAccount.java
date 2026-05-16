package org.example.lab_session2.question3;

public class BankAccount {
    private Long balance = 0L;

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        synchronized (this) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Deposited: " + amount + ", Current Balance: " + this.balance);
            }
        }
    }

    public void withdraw(int amount){
        synchronized (this) {
             if(this.balance >= amount && amount > 0){
                this.balance -= amount;
                System.out.println("Withdrew: " + amount + ", Current Balance: " + this.balance);
            }
        }
    }
}
