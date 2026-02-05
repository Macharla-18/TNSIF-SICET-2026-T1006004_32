package com.tnsif.Tasks.exercise1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int reversedNum = 0, remainder;
        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum)
            System.out.println(originalNum + " is a Palindrome.");
        else
            System.out.println(originalNum + " is not a Palindrome.");
            
        sc.close();
    }
}