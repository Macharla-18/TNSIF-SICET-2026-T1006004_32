package com.tnsif.Interfaces;

public class FunctionalD {
    public static void main(String[] args) {
        Functional obj = () -> System.out.println("Functional Interface Method Executed");
        obj.show();
    }
}