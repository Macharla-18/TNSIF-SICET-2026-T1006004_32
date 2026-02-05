package com.tnsif.Encapsulation;

public class Student {
    // 1. Private data members 
    private String name;
    private int rollNo;

    // 2. Public Getter for Name
    public String getName() {
        return name;
    }

    // 3. Public Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Public Getter for RollNo
    public int getRollNo() {
        return rollNo;
    }

    // Public Setter with Validation
    public void setRollNo(int rollNo) {
        if (rollNo <= 0) {
            System.out.println("Invalid Roll Number!");
        } else {
            this.rollNo = rollNo;
        }
    }
}