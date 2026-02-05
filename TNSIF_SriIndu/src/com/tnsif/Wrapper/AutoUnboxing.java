package com.tnsif.Wrapper;

public class AutoUnboxing {
    public static void main(String[] args) {
        Integer a = 3; 
        
        // Explicit unboxing
        int i = a.intValue(); 
        
        // Auto-unboxing (The most common way)
        int j = a; 
        
        System.out.println("Wrapper object: " + a);
        System.out.println("Explicit unbox: " + i);
        System.out.println("Auto-unbox: " + j);
    }
}