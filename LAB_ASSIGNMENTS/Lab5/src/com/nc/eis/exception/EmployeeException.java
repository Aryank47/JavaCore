package com.nc.eis.exception;

public class EmployeeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3229928720582096682L;
	String msg;
	
	public EmployeeException() {
		
	}
	
	public EmployeeException(String msg) {
		this.msg=msg;
	}
	
	public void showError() {
		System.err.println(msg);
	}


}
