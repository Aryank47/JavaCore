 
package com.netcracker.dto;

import java.time.LocalDateTime;


public class Customer extends Mobile {
	private String name;
	private String email;
	private String contact;
	private int mobileId;
	private int purchaseId;
	private LocalDateTime purchaseDate;
	
	
	
	public Customer() {
		super();
	}


	public Customer(String name, String email, String contact, int mobileId, int purchaseId, LocalDateTime purchaseDate) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.mobileId = mobileId;
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
	}
	
	


	public Customer(String name, String email, String contact, int mobileId) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.mobileId = mobileId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public int getMobileId() {
		return mobileId;
	}


	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}


	public int getPurchaseId() {
		return purchaseId;
	}


	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}


	public java.sql.Date getPurchaseDate() {
		purchaseDate=LocalDateTime.now();
		java.sql.Date sqlDate = java.sql.Date.valueOf(purchaseDate.toLocalDate());
		return sqlDate;
	}


	public void setPurchaseDate() {
		purchaseDate = LocalDateTime.now();
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", contact=" + contact + ", mobileId=" + mobileId
				+ ", purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + "]";
	}
	
	
	
	
	

}
