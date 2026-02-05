package com.tnsif.AccessModifiers.Different;

public class SameClass {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40; // Default

    public void show() {
        // A class can always access its own private, protected, and default members
        System.out.println("Accessing own members:");
        System.out.println("Public: " + a);
        System.out.println("Private: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Default: " + d);
    }
}