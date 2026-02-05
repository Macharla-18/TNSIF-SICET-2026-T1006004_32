package com.tnsif.SortingInterfaces.Comparable;
import java.util.*;

public class StudentD {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(102, "Zack"));
        list.add(new Student(101, "Alice"));

        Collections.sort(list); // Uses the compareTo method inside Student
        for (Student s : list) System.out.println(s);
    }
}