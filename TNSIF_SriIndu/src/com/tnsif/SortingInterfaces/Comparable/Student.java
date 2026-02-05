package com.tnsif.SortingInterfaces.Comparable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Default sorting logic: By ID
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
