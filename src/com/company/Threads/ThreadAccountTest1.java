package com.company.Threads;

import com.company.Threads.Domain.Account;

public class ThreadAccountTest1 implements Runnable {
    static final Account account = new Account();

    public static void main(String[] args) {

        ThreadAccountTest1 threadAccount = new ThreadAccountTest1();
        Thread t1 = new Thread(threadAccount, "Bellamy");
        Thread t2 = new Thread(threadAccount, "Nami");
        t1.start();
        t2.start();

    }

    private  static void withdrawal(int amount) {
        synchronized(account) {
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw money ");
                account.withdrawal(amount);
                System.out.println(Thread.currentThread().getName() + " Finished Withdrawing Money Current Balanace " + account.getBalance());
            } else {
                System.out.println("not Enough money to withdraw" + Thread.currentThread().getName() + " Withdraw money");
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("bad Secrets");

            }
        }

    }
}
