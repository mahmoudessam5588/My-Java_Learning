package com.company.Threads;
class ThreadExample extends Thread{
    private final char c;
public ThreadExample(char c){
    this.c = c;
}

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i <500;i++){
            System.out.print(c);
            if (i%100==0){
                System.out.println();
            }
        }
    }
}
public class ThreadsTest1 {
    public static void main(String[] args) {
        //ThreadExample t1 =new ThreadExample('A');
        //ThreadExample t2 =new ThreadExample('B');
        //ThreadExample t3 =new ThreadExample('C');
        //ThreadExample t4 =new ThreadExample('D');
        //ThreadExample t5 =new ThreadExample('E');
      Thread t1 = new Thread(new ThreadRunnableExample('A'),"Thread A");
      Thread t2 = new Thread(new ThreadRunnableExample('B'),"Thread B");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("+++++++++++++" + Thread.currentThread().getName());
    }

}

record ThreadRunnableExample(char c) implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


