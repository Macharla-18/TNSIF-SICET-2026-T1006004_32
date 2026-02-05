package com.tnsif.SortingInterfaces.Comparable;
import java.util.*;

public class IntegerArraylist {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(55, 12, 89, 1);
        Collections.sort(numbers); 
        System.out.println("Sorted Integers: " + numbers);
    }
}