package com.company.Threads.Domain;

public class Account {
     private int balance = 70;
public void withdrawal(int amount) {
    this.balance = this.balance -amount;
}
    public int getBalance() {
        return balance;
    }
}
