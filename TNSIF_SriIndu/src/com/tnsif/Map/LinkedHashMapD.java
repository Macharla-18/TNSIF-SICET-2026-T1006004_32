package com.tnsif.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapD {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
        lmap.put(10, "Apple");
        lmap.put(5, "Banana");
        lmap.put(20, "Cherry");
        
        System.out.println("LinkedHashMap (Insertion Order): " + lmap);
    }
}