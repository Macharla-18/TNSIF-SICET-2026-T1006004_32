package com.tnsif.Synchronization;

public class ThreadDemo {
	double balance=1000;
	synchronized public void withdraw(double amount) {
		System.out.println("Going to withdraw amount...");
		if(amount>balance) {
			System.out.println("less balance,you can't withdraw,wait for deposit");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance=balance-amount;
		System.out.println("withdraw completed");
	}
	synchronized public void deposit(double amount) {
		System.out.println("Going to deposit amount...");
		balance=balance+amount;
		notify();
		System.out.println("Deposit completed..");
	}
}