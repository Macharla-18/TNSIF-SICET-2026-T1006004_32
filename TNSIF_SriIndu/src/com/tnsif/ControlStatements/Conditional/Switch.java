package com.tnsif.ControlStatements.Conditional;

public class Switch {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A': System.out.println("Excellent!"); 
            break;
            case 'B': System.out.println("Good job"); 
            break;
            default: System.out.println("Keep trying");
        }
    }
}