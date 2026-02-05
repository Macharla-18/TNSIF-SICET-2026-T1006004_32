package com.tnsif.Lambda;

interface Test{
	boolean isEven(int x);
}
public class LambdaD {

	public static void main(String[] args) {
		 
		Test t=(x)->x%2==0;
		System.out.println(t.isEven(15));
		System.out.println(t.isEven(10));
	}

}