package com.netcracker.person_details_exception;

public class AgeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8613947811582411801L;
	String msg;
	
	public AgeException() {
		
	}
	
	public AgeException(String msg) {
		this.msg=msg;
	}
	
	public void showError() {
		System.err.println(msg);
	}


}
