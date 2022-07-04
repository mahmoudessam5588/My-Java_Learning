package com.javapoint.collections;

import java.util.List;
import java.util.PriorityQueue;

public class PirorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<String>pr = new PriorityQueue<>(List.of("A","B","C","D","E","F"));
        System.out.println(pr.poll());
        System.out.println(pr);
        System.out.println(pr.remove());
        System.out.println(pr);
        System.out.println(pr.peek());
        System.out.println(pr);
        System.out.println(pr.element());
    }


}
