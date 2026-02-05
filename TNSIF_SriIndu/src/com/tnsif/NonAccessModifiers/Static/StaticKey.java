package com.tnsif.NonAccessModifiers.Static;

public class StaticKey {
    // Static variable: stored in Class Area, shared by all instances
    static int count = 0;
    String name;

    public StaticKey(String name) {
        this.name = name;
        count++; // Every time a new object is born, the global count goes up
    }

    public void displayInstanceName() {
        System.out.println("Instance name: " + name);
    }

    public static void displayCount() {
        System.out.println("Total objects in memory: " + count);
    }
}