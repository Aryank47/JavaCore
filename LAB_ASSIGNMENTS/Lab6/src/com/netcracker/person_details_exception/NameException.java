package com.netcracker.person_details_exception;

public class NameException extends Exception {
	
		private static final long serialVersionUID = 5272186397759628584L;
		String msg;
		
		public NameException() {
			
		}
		
		public NameException(String msg) {
			this.msg=msg;
		}
		
		public void showError() {
			System.err.println(msg);
		}

}
