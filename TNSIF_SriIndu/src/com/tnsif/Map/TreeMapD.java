package com.tnsif.Map;
import java.util.TreeMap;

public class TreeMapD {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(3, "Red");
        tmap.put(1, "Blue");
        tmap.put(2, "Green");
        
        System.out.println("TreeMap (Sorted Order): " + tmap);
    }
}