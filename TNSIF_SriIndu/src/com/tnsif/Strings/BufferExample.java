package com.tnsif.Strings;

public class BufferExample {
    public static void main(String[] args) {
        // StringBuffer is mutable (can be changed)
        StringBuffer sb = new StringBuffer("Hello");
        
        sb.append(" World");
        System.out.println("After Append: " + sb);
        
        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}