package com.tnsif.Map;
import java.util.HashMap;

public class HashMapD { // Renamed slightly to avoid conflict with java.util.HashMap
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        
        System.out.println("HashMap (Unordered): " + map);
    }
}