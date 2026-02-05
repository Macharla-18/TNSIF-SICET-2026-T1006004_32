package com.tnsif.Polymorphism.Compiletime;

public class OverLoadingD {
    public static void main(String[] args) {
        OverLoading obj = new OverLoading();
        System.out.println("--- Method Overloading Result ---");
        System.out.println("Sum of 2 integers: " + obj.add(10, 20));
        System.out.println("Sum of 3 integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of 2 doubles:  " + obj.add(12.5, 7.5));
    }
}