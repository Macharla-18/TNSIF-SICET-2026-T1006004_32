package com.tnsif.Lambda;
import java.util.function.Consumer;

public class ConsumerD {

	public static void main(String[] args) {
		
		Consumer<String> len=str->System.out.println(str.length());
		String[] arr= {"Amrutha","Varshini","Macharla"};
		for(String k:arr)
			len.accept(k);
	}

}

