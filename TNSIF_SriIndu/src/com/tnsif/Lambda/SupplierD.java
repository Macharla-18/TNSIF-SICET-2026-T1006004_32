package com.tnsif.Lambda;

import java.util.function.Supplier;

public class SupplierD {

	public static void main(String[] args) {
		
		Supplier<String> otp=()->{
			String s="";
			for(int i=1;i<=6;i++)
				s=s+(int)(Math.random()*10);
			return s;
		};
		System.out.println(otp.get());
	}

}