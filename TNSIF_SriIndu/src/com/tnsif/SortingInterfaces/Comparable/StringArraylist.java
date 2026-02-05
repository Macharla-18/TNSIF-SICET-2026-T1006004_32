package com.tnsif.SortingInterfaces.Comparable;
import java.util.*;

public class StringArraylist {
    public static void main(String[] args) {
        List<String> tech = Arrays.asList("Java", "Python", "C++", "Android");
        Collections.sort(tech); 
        System.out.println("Alphabetical Order: " + tech);
    }
}