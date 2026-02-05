package com.tnsif.Collections.Sets;
import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("One");
        lhs.add("Two");
        System.out.println("LinkedHashSet (Preserves Insertion Order): " + lhs);
    }
}