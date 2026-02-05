package com.tnsif.Collections.List;
import java.util.Vector;

public class VectorD {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Apple");
        vec.add("Banana");
        System.out.println("Vector (Thread-safe): " + vec);
    }
}
