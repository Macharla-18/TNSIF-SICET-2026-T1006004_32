package com.tnsif.Tasks.exercise1;

public class First20primes {
    public static void main(String[] args) {
        int count = 0;
        int num = 2; // Starting from the first prime number

        System.out.println("First 20 Prime Numbers:");
        
        while (count < 20) {
            boolean isPrime = true;
  
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}