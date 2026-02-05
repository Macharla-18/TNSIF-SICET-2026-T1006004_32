package com.tnsif.Assignments.Banking;

public interface Bank {
	int DEPOSIT_LIMIT=25000;
	int MIN_BALANCE=1000;
	
	void deposit(Account acc,double amount);
	void withdraw(Account acc,double amount);

}
