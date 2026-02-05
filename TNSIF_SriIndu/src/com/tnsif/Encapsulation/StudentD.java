package com.tnsif.Encapsulation;

public class StudentD {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        // s1.name = "John"; // This would throw a COMPILE ERROR (private access)
        
        s1.setName("Amrutha"); // Correct way
        s1.setRollNo(101);  // Correct way
        
        System.out.println("Student Name: " + s1.getName());
    }
}