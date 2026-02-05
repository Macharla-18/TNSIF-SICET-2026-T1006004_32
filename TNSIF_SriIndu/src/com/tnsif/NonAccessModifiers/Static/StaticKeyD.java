package com.tnsif.NonAccessModifiers.Static;

public class StaticKeyD {
    public static void main(String[] args) {
        // 1. Accessing static method before any objects exist
        StaticKey.displayCount(); 

        // 2. Creating and using instances
        StaticKey s1 = new StaticKey("Laptop");
        StaticKey s2 = new StaticKey("Smartphone");

        // Now we use the instances!
        s1.displayInstanceName(); // Prints "Laptop"
        s2.displayInstanceName(); // Prints "Smartphone"

        // 3. Static count is now 2 because both s1 and s2 incremented it
        StaticKey.displayCount(); 
    }
}