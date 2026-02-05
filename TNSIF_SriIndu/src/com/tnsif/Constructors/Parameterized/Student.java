package com.tnsif.Constructors.Parameterized;

public class Student {
    private String studentName;
    private int id;

    // Parameterized Constructor
    public Student(String name, int id) {
        System.out.println("Parameterized Constructor Called");
        this.studentName = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Student ID: " + id + ", Name: " + studentName);
    }
}