package com.tnsif.Wrapper;

public class AutoBoxing {
    public static void main(String[] args) {
        int a = 20;
        Integer i = Integer.valueOf(a); // Explicit boxing
        Integer j = a; // Autoboxing
        
        System.out.println(a + " " + i + " " + j);
    }
}