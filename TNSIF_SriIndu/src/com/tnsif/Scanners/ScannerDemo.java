package com.tnsif.Scanners;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Student s=new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("=== Enter Your Data ===");
		System.out.println("Enter your name : ");
		String name=sc.nextLine();
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		System.out.println("Enter your branch : ");
		String branch=sc.next();
		System.out.println("Enter your cgpa : ");
		double cgpa=sc.nextDouble();
		System.out.println("Are you interested in higher studies (true/false)? ");
		boolean higher_study=sc.nextBoolean();
		
		System.out.println("=== Entered Details Are ====");
		System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Branch = "+branch);
        System.out.println("CGPA = "+cgpa);
        System.out.println("Interested in higher studies? "+higher_study);
        s.display();
        sc.close();
	}

}
