package com.tnsif.SortingInterfaces.Comparator;
import java.util.*;

public class StudentM {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(50, "Amrutha"));
        al.add(new Student(20, "Varshini"));

        System.out.println("--- Sort by Name ---");
        Collections.sort(al, new SortName());
        al.forEach(System.out::println);

        System.out.println("\n--- Sort by ID ---");
        Collections.sort(al, new SortId());
        al.forEach(System.out::println);
    }
}