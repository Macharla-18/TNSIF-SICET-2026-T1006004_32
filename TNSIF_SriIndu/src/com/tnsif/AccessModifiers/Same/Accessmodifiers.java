package com.tnsif.AccessModifiers.Same;

public class Accessmodifiers {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // No modifier means 'default'
    private int privateVar = 40;

    public void display() {
        // All are accessible inside the same class
        System.out.println(publicVar + " " + protectedVar + " " + defaultVar + " " + privateVar);
    }
}