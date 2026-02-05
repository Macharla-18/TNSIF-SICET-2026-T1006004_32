package com.tnsif.Arrays;

public class SingleArray {
    public static void main(String[] args) {
        // Initializing a single dimensional array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Elements of Single Dimensional Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index " + i + ": " + numbers[i]);
        }
    }
}
