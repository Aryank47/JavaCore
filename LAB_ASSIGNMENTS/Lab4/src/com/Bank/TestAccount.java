package com.Bank;

import java.util.Scanner;
import com.netcracker.person_details_exception.AgeException;
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter the age of the account holder.");
			int age=sc.nextInt();
			if(age<=15) {
				throw new AgeException("Age less than 15.Cannot create the account.");
			}
			SavingsAccount smith=new SavingsAccount("Smith", age,40000);
			CurrentAccount kathy=new CurrentAccount("Kathy", age,50000);
			
			smith.setAccNo();
			
			kathy.setAccNo();
			
			smith.deposit(2000);
			kathy.withdraw(200000);
			kathy.deposit(4000);
			
			
			smith.deposit(2000);
			kathy.withdraw(200000);
			kathy.deposit(4000);
			
			smith.deposit(2000);
			kathy.withdraw(200000);
			kathy.deposit(4000);
			
		}catch(AgeException e) {
			e.showError();
		}
		
		
		

	}

}
