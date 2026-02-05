package com.tnsif.Polymorphism.Runtime;

public class OverRidingD {
    public static void main(String[] args) {
        Bank b;
        System.out.println("--- Method Overriding Result ---");
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest() + "%");
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest() + "%");
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest() + "%");
    }
}
