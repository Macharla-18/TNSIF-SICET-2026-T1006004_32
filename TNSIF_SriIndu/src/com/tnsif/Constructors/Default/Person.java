package com.tnsif.Constructors.Default;

public class Person {
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        System.out.println("Default Constructor Called");
        name = "Unknown";
        age = 0;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}