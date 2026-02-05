package com.tnsif.SortingInterfaces.Comparator;

public class Student {
    int id;
    String name;

    // Constructor to initialize the object
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Standard getters (optional but recommended)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Overriding toString so we can print the object data instead of the memory address
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}