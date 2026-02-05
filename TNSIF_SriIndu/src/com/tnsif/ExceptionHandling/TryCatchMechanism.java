package com.tnsif.ExceptionHandling;

public class TryCatchMechanism {
    public static void main(String[] args) {
        try {
            System.out.println("Attempting division...");
            System.out.println("Result: " + (50 / 0)); 
            
        } catch (ArithmeticException e) {
            System.err.println("Exception handled: Cannot divide by zero.");
            
        } finally {
            System.out.println("Finally block: Cleanup or closing operations go here.");
        }

        System.out.println("Rest of the code continues...");
    }
}