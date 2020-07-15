package com.Bank;
import com.netcracker.customexception.MinimumBalanceException;


public class CurrentAccount extends Account{
	
	public CurrentAccount(String accHolder, int accHolderAge, double balance) {
		super(accHolder, accHolderAge, balance);
		// TODO Auto-generated constructor stub
	}

	double overdrawLimit=100000;

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		//double tempBalance=0;
		try {
			if(amount>overdrawLimit) {
				throw new MinimumBalanceException("Withdrawal amount over the limit. "
						+ "Please try again with amount less than or equal to 100000.");
			}
			try {
				if(amount>balance) {
					throw new MinimumBalanceException("Withdrawal amount more than balance. "
				+"Please try again with less amount.");
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
