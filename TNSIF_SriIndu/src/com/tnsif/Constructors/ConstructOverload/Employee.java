package com.tnsif.Constructors.ConstructOverload;

public class Employee {
    private int id;
    private String name;
    private String department;

    // Constructor 1: No arguments
    public Employee() {
        this.id = 0;
        this.name = "New Employee";
    }

    // Constructor 2: Two arguments
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.department = "General";
    }

    // Constructor 3: Three arguments
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void showDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Dept: " + department);
    }
}