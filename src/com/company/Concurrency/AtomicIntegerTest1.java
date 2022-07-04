package com.company.Concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count;
    AtomicInteger integer = new AtomicInteger();
    private final Lock lock = new ReentrantLock();

    public AtomicInteger getInteger() {
        return integer;
    }

    synchronized void increment(){
        lock.lock();
        try {
            this.count++;
            integer.incrementAndGet();
        }finally {
            lock.unlock();
        }

    }
    int getCount(){
        return this.count;
    }
}
public class AtomicIntegerTest1 {
    public static void main(String[] args) throws InterruptedException {
        Counter count = new Counter();
        Runnable r = ()->{
          for (int i = 0; i <10000;i++){
              count.increment();
          }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.getCount());
        System.out.println(count.getInteger());
    }

}
