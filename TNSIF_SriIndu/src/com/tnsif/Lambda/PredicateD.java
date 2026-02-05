package com.tnsif.Lambda;

import java.util.function.Predicate;

public class PredicateD {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven=x->x%2==0;
		System.out.println(isEven.test(10));
		System.out.println(isEven.test(15));
	}

}