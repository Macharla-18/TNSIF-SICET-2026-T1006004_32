package com.tnsif.AccessModifiers.Same;

public class NonSubClass {
    public void test() {
        Accessmodifiers obj = new Accessmodifiers();
        System.out.println(obj.publicVar);    // Accessible
        System.out.println(obj.protectedVar); // Accessible
        System.out.println(obj.defaultVar);   // Accessible
        // System.out.println(obj.privateVar); // ERROR
    }
}