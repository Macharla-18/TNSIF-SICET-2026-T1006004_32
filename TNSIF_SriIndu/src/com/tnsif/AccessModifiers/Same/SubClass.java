package com.tnsif.AccessModifiers.Same;

public class SubClass extends Accessmodifiers {
    public void checkAccess() {
        System.out.println(publicVar);    // Accessible
        System.out.println(protectedVar); // Accessible
        System.out.println(defaultVar);   // Accessible
        // System.out.println(privateVar); // ERROR: Private not accessible
    }
}