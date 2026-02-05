package com.tnsif.Collections.Sets;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(10);
        ts.add(30);
        System.out.println("TreeSet (Sorted): " + ts);
    }
}