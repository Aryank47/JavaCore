package com.netcracker.customexception;

public class DatatabaseException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4163558056404158575L;

	public DatatabaseException() {
		
	}
	
	public DatatabaseException(String msg) {
		super(msg);
		//System.out.println(msg);
		
	}

}
