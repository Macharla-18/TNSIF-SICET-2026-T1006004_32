package com.tnsif.NonAccessModifiers.Final;

public class FinalKey {
    // Final variable: cannot be changed once assigned
    final int threshold = 100;

    // Final method: cannot be overridden by subclasses
    public final void showMessage() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}