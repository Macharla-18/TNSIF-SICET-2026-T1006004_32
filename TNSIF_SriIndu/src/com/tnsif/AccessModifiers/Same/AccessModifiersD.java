package com.tnsif.AccessModifiers.Same;

public class AccessModifiersD {
    public static void main(String[] args) {
        Accessmodifiers obj = new Accessmodifiers();
        
        // Testing access levels
        System.out.println("Public Variable: " + obj.publicVar);    // Accessible
        System.out.println("Protected Variable: " + obj.protectedVar); // Accessible (Same package)
        System.out.println("Default Variable: " + obj.defaultVar);     // Accessible (Same package)
        
        // System.out.println(obj.privateVar); 
        // ^ UNCOMMENTING THE ABOVE WILL CAUSE A COMPILE ERROR
        // Private is ONLY visible inside the 'AccessModifiers' class itself.

        System.out.println("-----------------------------------");
        
        obj.display();
    }
}