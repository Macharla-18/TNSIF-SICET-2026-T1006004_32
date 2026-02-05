package com.tnsif.Tasks.exercise4;

import java.util.stream.Stream;

public class SortExample {

	public static void main(String[] args) {
		
		Stream.of(6,10,5,12,4,7,1,9)
			.filter(x->x%2==0)
			.sorted()
			.map(x->x*x)
			.forEach(System.out::println);

	}

}