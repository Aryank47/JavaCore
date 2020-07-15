package com.netcracker.customexception;

@SuppressWarnings("serial")
public class MinimumBalanceException extends Exception {
	
	String message;

	public MinimumBalanceException() {
		
	}
	
	public MinimumBalanceException(String message) {
		//super(message);
		this.message=message;
	}
	
	public void showError() {
		System.out.println(message);
	}

}
