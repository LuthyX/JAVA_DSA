package com.luti.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {
        Queue<String> queues = new LinkedList<>();
        queues.add("red");
        queues.add("green");
        queues.add("blue");
        System.out.println(queues);
        System.out.println(queues.peek());
        System.out.println(queues.poll());
        System.out.println(queues.remove());
        System.out.println(queues.size());
    }
}
