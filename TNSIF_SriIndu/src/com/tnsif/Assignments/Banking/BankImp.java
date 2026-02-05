package com.tnsif.Assignments.Banking;

public class BankImp implements Bank{
	public void deposit(Account account,double amount) {
		if(amount>DEPOSIT_LIMIT) {
			System.out.println("Deposit amount must be less than 25000!!");
		}
		else {
			account.setBal(account.getBal()+amount);
			System.out.println("Amount is deposited.");
		}
	}
	public void withdraw(Account account,double amount) {
		if(account.getBal()-amount>=MIN_BALANCE) {
			account.setBal(account.getBal()-amount);
			System.out.println("Amount is withdrawn.");
		}
		else {
			System.out.println("Insufficient funds!..");
		}
	}

}
