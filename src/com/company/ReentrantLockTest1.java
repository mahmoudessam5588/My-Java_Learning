package com.company;

import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
    private String name;
    private ReentrantLock reentrantLock;

    public Worker(String name, ReentrantLock reentrantLock) {
        this.name = name;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        try {
            System.out.printf("Thread %s entered  Critical session%n",name);
            System.out.printf("%d Threads Waiting For The Lock%n",reentrantLock.getQueueLength());
            System.out.printf("%s is Going To Wait 2 Seconds%n",name);
            Thread.sleep(2000);
            System.out.printf("%s Finished The Session%n",name);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }


    }
}

public class ReentrantLockTest1 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A",lock)).start();
        new Thread(new Worker("B",lock)).start();
        new Thread(new Worker("C",lock)).start();
        new Thread(new Worker("D",lock)).start();
        new Thread(new Worker("E",lock)).start();
    }

}
