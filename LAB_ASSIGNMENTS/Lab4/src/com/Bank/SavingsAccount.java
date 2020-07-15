package com.Bank;


import com.netcracker.customexception.MinimumBalanceException;

public class SavingsAccount extends Account {
	
	public SavingsAccount(String accHolder, int accHolderAge,double balance) {
		super(accHolder, accHolderAge,balance);
		// TODO Auto-generated constructor stub
	}

	double minimumBalance=500;
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		double tempBalance=balance-amount;
		try {
			if(amount>balance) {
				throw new MinimumBalanceException("Withdrawal amount more than balance. "
			+"Please try again with less amount.");
			}
			try {
				if(tempBalance<minimumBalance) {
					throw new MinimumBalanceException("Cannot process your request.Please try again with less amount.");
				}
				else {
					balance=balance-amount;
					System.out.println("Amount withdrawn = "+amount);
					System.out.println("Transaction Successful.");
				}
		}
		catch(MinimumBalanceException e) {
			e.showError();
			System.out.println("Transaction Unsuccessful.");
		}
		
		}catch(MinimumBalanceException e) {
			e.showError();
			System.out.println("Transaction Unsuccessful.");
		}
		
	}
			
		
		
}



