package com.netcracker.customexception;

public class CustomException extends Exception {
	
	private static final long serialVersionUID = -8679688244043411984L;

	public CustomException() {
		super();
	}
	
	public CustomException(String msg) {
		super(msg);
	}

}
