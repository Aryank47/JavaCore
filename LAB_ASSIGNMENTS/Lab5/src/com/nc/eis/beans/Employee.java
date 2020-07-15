package com.nc.eis.beans;

import java.util.concurrent.ThreadLocalRandom;

public class Employee {
	private int id;
	private String name;
	private Designation designation;
	private InsuranceScheme insuranceScheme;
	private int salary;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		id = ThreadLocalRandom.current().nextInt(1000000,9999999);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation() {
		if(getSalary()>5000 & getSalary()<20000) {
			designation=Designation.SYSTEM_ASSOCIATE;
		}
		else if(getSalary()>=20000 & getSalary()<40000) {
			designation=Designation.PROGRAMMER;
		}
		else if(getSalary()>=40000) {
			designation=Designation.MANAGER;
		}
		else {
			designation=Designation.CLERK;
		}
	}

	public InsuranceScheme getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme() {
		if(designation==Designation.SYSTEM_ASSOCIATE) {
			insuranceScheme=InsuranceScheme.SCHEME_C;
		}
		else if(designation==Designation.PROGRAMMER) {
			insuranceScheme=InsuranceScheme.SCHEME_B;
		}
		else if(designation==Designation.MANAGER) {
			insuranceScheme=InsuranceScheme.SCHEME_A;
		}
		else {
			insuranceScheme=InsuranceScheme.NO_SCHEME;
		}
	}

	
	
	public Employee() {
		
	}
	
	public Employee(int id,String name,Designation designation,InsuranceScheme insuranceScheme) {
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.insuranceScheme=insuranceScheme;
	}
	
	

}
