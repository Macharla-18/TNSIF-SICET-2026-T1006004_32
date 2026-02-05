package com.tnsif.Collections.List;
import java.util.Stack;

public class StackD {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Top");
        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
    }
}