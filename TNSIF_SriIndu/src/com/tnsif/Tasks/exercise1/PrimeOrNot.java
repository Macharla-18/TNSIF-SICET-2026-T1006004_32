package com.tnsif.Tasks.exercise1;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        
        boolean flag = false;
        if (n <= 1) {
            flag = true;
        } else {
            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
        }

        if (!flag)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
            
        sc.close();
    }
}