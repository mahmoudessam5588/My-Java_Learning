package com.company.Collections;

import java.util.*;

public class NeedForCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mahmoud");
        list.add("Essam");
        list.add("El-Masry");
        Iterator<String> itr = list.iterator();
        do {
            System.out.println(itr.next());

        } while (itr.hasNext());
        Stack<String> stack = new Stack<>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr1 = stack.iterator();
        do {
            System.out.println(itr1.next());

        } while (itr1.hasNext());

        System.out.println("-----------------------------------");
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());

        }
        String remove = queue.remove();
        System.out.println(remove + " here");
        System.out.println("--------- "+ queue);
        String poll = queue.poll();
        System.out.println(poll + "Here");
        System.out.println("--------- "+ queue);
        System.out.println("after removing two elements:");
        Iterator<String> itr3 = queue.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());

        }
        //ArrayDeque<String> dequeue =  new ArrayDeque<String>();
    }

    }
