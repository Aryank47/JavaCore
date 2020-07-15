import java.util.concurrent.ThreadLocalRandom;

import com.netcracker.customexception.MinimumBalanceException;

abstract public class Accounts {
	
	long accNo;
	double balance;
	String accHolder;
	
	public long getAccNo() {
		return accNo;
	}

	public void setAccNo() {
		// Obtain a number between [0 - 49].
		 accNo = ThreadLocalRandom.current().nextLong(100000000,999999999);

	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	public void deposit(double amount){
		balance+=amount;
		System.out.println("Amount Deposited. Transaction Successful");
		System.out.println("Updated Balance in account with Account No. "+getAccNo()+" is "+getBalance());
	}
	
	double minimumBalance=500;
	

	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		double tempBalance=balance-amount;
		try {
			if(amount>balance) {
				throw new MinimumBalanceException("Withdrawal amount more than balance. "
			+"Please try again with less amount.");
			}
		}
		catch(MinimumBalanceException e) {
			e.showError();
			System.out.println("Transaction Unsuccessful.");
		}
		
		try {
			if(tempBalance<minimumBalance) {
				throw new MinimumBalanceException("Cannot process your request.Please try again with less amount.");
			}
		}catch(MinimumBalanceException e) {
			e.showError();
			System.out.println("Transaction Unsuccessful.");
		}
		
		
		balance=balance-amount;
		System.out.println("Amount withdrawn = "+amount);
		System.out.println("Transaction Successful.");
	}
			
		
	public double getBalance(){
		return balance;
	}
	
}
