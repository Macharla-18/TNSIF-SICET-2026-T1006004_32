package com.tnsif.Collections.Sets;
import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("A"); // Duplicate, will be ignored
        set.add("B");
        System.out.println("HashSet (Unordered, Unique): " + set);
    }
}