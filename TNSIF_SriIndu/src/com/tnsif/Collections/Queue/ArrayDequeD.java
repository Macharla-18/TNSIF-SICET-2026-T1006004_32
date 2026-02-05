package com.tnsif.Collections.Queue;
import java.util.ArrayDeque;

public class ArrayDequeD {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.addFirst("Start");
        ad.addLast("End");
        System.out.println("ArrayDeque (Double Ended): " + ad);
    }
}