package com.netcracker;

import java.io.Serializable;

public class PersonDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6896408964586324348L;

	@Override
	public String toString() {
		return "PersonDetails [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", weight="
				+ weight + ", phoneNumber=" + phoneNumber + ", gender=" + gender + "]";
	}



	protected String firstName;
	protected String lastName;
	
	protected int age;
	protected double weight;
	protected String phoneNumber;
	protected String gender;
	
	//Default constructor
	public PersonDetails(){
		
	}
	
	//Parametrized constructor
	public PersonDetails(String firstName,String lastName, String gender,int age,double weight){
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.age=age;
		this.weight=weight;
	}
	
	
	
	public void showData(){
		
		System.out.println("Person Details:");
		System.out.println("_______________");
		System.out.println();
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
		System.out.println();
	}
	

}

