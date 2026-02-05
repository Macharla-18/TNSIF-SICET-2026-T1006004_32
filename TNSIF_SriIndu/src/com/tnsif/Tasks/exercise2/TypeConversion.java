package com.tnsif.Tasks.exercise2;

public class TypeConversion {
    public static void main(String[] args) {
        // Implicit
        int i = 100;
        long l = i; 
        float f = l;
        
        System.out.println("Implicit Conversion:");
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);

        // Explicit
        double d = 100.04;
        long l2 = (long) d;
        int i2 = (int) l2;

        System.out.println("\nExplicit Conversion:");
        System.out.println("Double value: " + d);
        System.out.println("Long value: " + l2);
        System.out.println("Int value: " + i2);
    }
}