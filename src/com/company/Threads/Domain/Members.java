package com.company.Threads.Domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return this.emails.size();
        }
    }

    public String retrieveEmails() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Checking if there are emails");
        synchronized (this.emails) {
            while (this.emails.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName()+ " No Emails found to be sent, waiting for instructions");
                this.emails.wait();

            }
        }
        return this.emails.poll();
    }
    public void addMemberEmail(String email){

        synchronized(this.emails) {
            System.out.println(Thread.currentThread().getName() + " Just added an email to the list");

            this.emails.add(email);
            this.emails.notifyAll();


        }
    }
    public void close(){
        open = false;
        synchronized(this.emails){
            System.out.println(Thread.currentThread().getName() + " notifying threads to be closed");
            this.emails.notifyAll();
        }

    }

}
