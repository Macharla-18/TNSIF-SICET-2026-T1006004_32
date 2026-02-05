package com.tnsif.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        // 2D Array representing a 2x3 matrix
        int[][] matrix = { {1, 2, 3}, {4, 5, 6} };

        System.out.println("Elements of 2D Array (Matrix):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}