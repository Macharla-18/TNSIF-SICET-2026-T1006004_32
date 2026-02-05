package com.tnsif.Tasks.exercise3;

public class NestedTry {
    public static void main(String[] args) {
    	        try {
    	            int a = 10;
    	            int b = 0;
    	            try {
    	                String s = (a > 5) ? null : "Amrutha"; 
    	                try {
    	                    int[] arr = {1, 2, 3, 4};
    	                    try {
    	                        String name = "Amrutha";
    	                        System.out.println(name.charAt(7)); // StringIndex error
    	                    } catch (StringIndexOutOfBoundsException e) {
    	                        System.out.println("String error: Index out of bounds.");
    	                    }
    	                    
    	                    System.out.println(arr[4]); // Array error
    	                } catch (ArrayIndexOutOfBoundsException e) {
    	                    System.out.println("Array error: Index out of bounds.");
    	                }
    	                
    	                System.out.println(s.length()); // NullPointer error
    	            } catch (NullPointerException e) {
    	                System.out.println("Null error: The string variable is null.");
    	            }
    	            
    	            int c = a / b; // Arithmetic error
    	            System.out.println("Result: " + c); 
    	            
    	        } catch (ArithmeticException e) {
    	            System.out.println("Arithmetic error: Division by zero is not possible.");
    	        }
    	    }
    	}