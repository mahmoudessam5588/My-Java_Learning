package com.company.Threads;

public class DeadLockTest1 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Runnable r1 = ()->{
          synchronized(obj1){
              System.out.println("Thread 1:Acquiring obj 1");
              System.out.println("Thread 1:Waiting for release");
              synchronized(obj2){
                  System.out.println("Thread 1 Acquiring obj 2");

              }
          }
        };
        Runnable r2 = ()-> {
            synchronized (obj2) {
                System.out.println("Thread 2:Acquiring obj 2");
                System.out.println("Thread 2:Waiting for release");
                synchronized (obj2) {
                    System.out.println("Thread 2 Acquiring obj 1");

                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    };
    }

