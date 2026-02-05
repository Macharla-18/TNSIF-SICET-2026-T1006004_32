package com.tnsif.Assignments.Banking;

public class BankImpD {

	public static void main(String[] args) {
		Bank bank=new BankImp();
		Account account=new Account(101,"Gopi",1000,bank);
		account.deposit(4000);
		account.withdraw(2000);
		System.out.println(account);
	}
}
