package com.tnsif.Inheritance.Hybrid;

public class Hybridinherit {
	public void display() {
		System.out.println("Parent class display method..");
	}
}
class A extends Hybridinherit{
	public void show() {
		System.out.println("A class show method..");
	}
}
class D extends A{
	public void print() {
		System.out.println("D class print method..");
	}
}
class B extends Hybridinherit{
	public void show() {
		System.out.println("B class show method..");
	}
}
class C extends Hybridinherit{
	public void show() {
		System.out.println("C class show method..");
	}
}