package com.tnsif.Strings;

public class StringHandling {
    public static void main(String[] args) {
        String str = "TNSIF Training";
        
        // Basic String methods
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Substring: " + str.substring(0, 5));
        
        // Comparison
        String s2 = "tnsif training";
        System.out.println("Equals (case sensitive): " + str.equals(s2));
        System.out.println("Equals (ignore case): " + str.equalsIgnoreCase(s2));
    }
}