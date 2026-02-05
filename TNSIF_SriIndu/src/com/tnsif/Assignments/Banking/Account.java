package com.tnsif.Assignments.Banking;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private Bank bank;
	
	Account(int accno,String name,double balance,Bank bank){
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		this.bank=bank;
	}
	public void setAccno(int accno) {
		this.accno=accno;
	}
	public int getAccno() {
		return accno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setBal(double balance) {
		this.balance=balance;
	}
	public double getBal() {
		return balance;
	}
	public void setBank(Bank bank) {
		this.bank=bank;
	}
	public Bank getBank() {
		return bank;
	}
	public void deposit(double amount) {
		bank.deposit(this,amount);
	}
	public void withdraw(double amount) {
		bank.withdraw(this,amount);
	}
	public String toString() {
			return "Account [Accno= "+accno+" name="+name+" balance="+balance+" bank="+bank+"]";
	}


}
