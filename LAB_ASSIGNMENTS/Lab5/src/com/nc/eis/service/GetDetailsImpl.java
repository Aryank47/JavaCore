package com.nc.eis.service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

import com.nc.eis.beans.Designation;
import com.nc.eis.beans.Employee;
import com.nc.eis.beans.InsuranceScheme;
import com.nc.eis.exception.EmployeeException;

public class GetDetailsImpl implements EmployeeService {
	Employee e=new Employee();
	HashMap<Integer,Employee> list = new HashMap<Integer,Employee>();
	Scanner sc=new Scanner(System.in);
	int i=1;
	public synchronized void getDetails() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the name of the employee.");
		sc.nextLine();
		String name=sc.nextLine();
		e.setName(name);
		e.setId();
		try {
			System.out.println("Enter the salary of the employee.");
			int salary=sc.nextInt();
			if(salary<3000) {
				throw new EmployeeException("Salary Less than minimum value. Please Increase the salary.");
			}
			else {
				e.setSalary(salary);
			}
		}catch(EmployeeException err) {
			err.showError();
		}
		
		e.setDesignation();
		e.setInsuranceScheme();	
		
		addEmployee(e);
		
	}
	
	@Override
	public void displayDetails() {
		
		System.out.println();
		System.out.println("Employee Details:");
		System.out.println("_______________");
		System.out.println();
		System.out.println("Name: "+e.getName());
		System.out.println("ID: "+e.getId());
		System.out.println("Designation: "+e.getDesignation());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Insurance Scheme: "+ e.getInsuranceScheme());
		System.out.println();
		
		
	}

	@Override
	public void findInsuranceScheme() {
		System.out.println();
		System.out.println("The Insurance Scheme provided to the employee "+e.getName()+" having employee id "+e.getId()+" is "
		+e.getInsuranceScheme());
		
	}
	
	public void addEmployee(Employee emp) {
		
		list.put(i,emp);
		i++;
		System.out.println("Employee added into the HashMap");
		System.out.println(list.toString());
		System.out.println();
	}
	
	public void deleteEmployee(int id) {
		if(list.containsKey(id)) {
			list.remove(id);
			System.out.println(list);
		}
		else {
			System.out.println("The specified id not present in the database.");
			System.out.println(list);
		}
		
		
	}
	
	public void sortedDisplay() {
		
		
	}

	@Override
	public String toString() {
		return "GetDetailsImpl [e=" + e + ", list=" + list + ", sc=" + sc + ", i=" + i + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	

}
