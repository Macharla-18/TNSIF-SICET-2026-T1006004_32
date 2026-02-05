package com.tnsif.ControlStatements.Conditional;

public class ElseIf {
    public static void main(String[] args) {
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Grade: B");
        }
    }
}