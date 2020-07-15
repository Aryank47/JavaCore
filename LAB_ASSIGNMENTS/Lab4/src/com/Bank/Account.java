package com.Bank;

import java.util.concurrent.ThreadLocalRandom;

abstract public class Account {
	long accNo;
	double balance;
	String accHolder;
	int accHolderAge;
	
	public Account(String accHolder,int accHolderAge,double balance){
		this.accHolder=accHolder;
		this.accHolderAge=accHolderAge;
		this.balance=balance;
	}
	
	public long getAccNo(){
		return accNo;
		
	}
	
	
	public void setAccNo() {
		 accNo = ThreadLocalRandom.current().nextLong(100000000,999999999);
	 }

	
	
	public void deposit(double amount){
		balance+=amount;
		System.out.println("Amount Deposited. Transaction Successful");
		System.out.println("Updated Balance in account with Account No. "+getAccNo()+" is "+getBalance());
	}
	
	
	
	public void withdraw(double amount){
		balance=balance-amount;
	}
	
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	public double getBalance(){
		return balance;
		
	}

}
