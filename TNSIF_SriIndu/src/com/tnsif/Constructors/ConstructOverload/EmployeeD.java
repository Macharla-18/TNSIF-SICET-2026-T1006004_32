package com.tnsif.Constructors.ConstructOverload;

public class EmployeeD {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(501, "Amrutha");
        Employee e3 = new Employee(502, "Sarah", "IT");

        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
    }
}