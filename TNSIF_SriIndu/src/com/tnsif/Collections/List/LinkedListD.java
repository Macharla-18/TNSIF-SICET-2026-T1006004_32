package com.tnsif.Collections.List;
import java.util.LinkedList;

public class LinkedListD {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addFirst(5);
        list.addLast(20);
        System.out.println("LinkedList: " + list);
    }
}