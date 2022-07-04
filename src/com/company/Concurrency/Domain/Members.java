package com.company.Concurrency.Domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try{
            return this.emails.size();
        }finally {
            lock.unlock();
        }
    }

    public String retrieveEmails() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Checking if there are emails");
        lock.lock();
        try {
            while (this.emails.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName()+ " No Emails found to be sent, waiting for instructions");
                condition.await();

            }
            return this.emails.poll();

        }finally {
            lock.unlock();
        }

    }
    public void addMemberEmail(String email){
        lock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " Just added an email to the list");

            this.emails.add(email);
            condition.signal();


        }finally {
            lock.unlock();
        }
    }
    public void close(){
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " notifying threads to be closed");
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }

}
