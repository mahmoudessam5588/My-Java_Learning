package com.company.Concurrency.service;


import com.company.Concurrency.Domain.Members;

public record EmailDelivaryService(Members members) implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " preparing to run and deliver emails");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String s = members.retrieveEmails();
                if (s == null) continue;
                System.out.println(threadName + " sending Email to" + s);
                Thread.sleep(2000);
                System.out.println(threadName + " send Successfully to email " + s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("All Emails Sent Successfully");
    }
}
