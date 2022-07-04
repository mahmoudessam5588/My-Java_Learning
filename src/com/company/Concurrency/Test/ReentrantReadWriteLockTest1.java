package com.company.Concurrency.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite{
    private final Map<String,String>map = new HashMap<>();
    private final ReentrantReadWriteLock rwl;

    MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }
    public void put(String key , String Value){
        rwl.writeLock().lock();
        try{
            map.put(key,Value);
            System.out.printf("Adding Key-Value %s - %s %n", key,Value);
            Thread.sleep(400);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwl.writeLock().unlock();
        }
    }
    public Set<String>allKeys(){
        rwl.readLock().lock();
        try{
            return map.keySet();

        }finally{
            rwl.readLock().unlock();
        }
    }
}
public class ReentrantReadWriteLockTest1 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite map = new MapReadWrite(rwl);
        Runnable writer = ()->{
          for (int i = 0; i < 20; i++) {
              map.put(String.valueOf(i),String.valueOf(i));
          }
        };
        Runnable reader = ()->{
          if (rwl.isWriteLocked()){
              System.out.println("WRITE LOCKED");
              rwl.readLock().lock();
              System.out.println("Got The Read Lock");
              try {
                  System.out.println(Thread.currentThread().getName()+" "+map.allKeys());
              }finally{
                  rwl.readLock().unlock();
              }
          }
        };
        Thread t1Writer = new Thread(writer);
        Thread t2Reader = new Thread(reader);
        Thread t3Reader = new Thread(reader);
        t1Writer.start();
        t2Reader.start();
        t3Reader.start();

    }

}
