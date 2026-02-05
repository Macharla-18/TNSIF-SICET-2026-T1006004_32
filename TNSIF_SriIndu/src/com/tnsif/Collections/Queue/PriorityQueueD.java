package com.tnsif.Collections.Queue;
import java.util.PriorityQueue;

public class PriorityQueueD {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10); // Automatically ordered (natural sorting)
        pq.add(30);
        System.out.println("PriorityQueue: " + pq);
    }
}