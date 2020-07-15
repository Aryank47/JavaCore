package com.netcracker.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.netcracker.customexception.DatatabaseException;
import com.netcracker.dto.Employee;
import com.netcracker.service.EmployeeService;
import com.netcracker.service.EmployeeServiceImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService empService=new EmployeeServiceImpl();//client is using service object
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 1 for get employee by ID\nEnter 2 for GET ALL\nEnter 3 for Delete by ID\nEnter 4 for INSERT"
				+ "\nEnter 5 UPDATE\nEnter 6 for EXIT");
		while(true) {
			
			try {
				System.out.println();
				System.out.println("Enter your choice(1/2/3/4/5/6)");
				int choice=Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:{
					System.out.println("Enter Employee id");
					int empID=Integer.parseInt(br.readLine());
					try {
						Employee employee=empService.getEmployeeByID(empID);
						System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSalary());
					} catch (DatatabaseException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
				}
					
					break;
					
				case 2:{
					List<Employee> emp=new LinkedList<Employee>();
					Employee employee=null;
					try {
						emp=empService.getAllEmployee();
						Iterator<Employee> it=emp.iterator();
						while(it.hasNext()) {
							employee=it.next();
							System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSalary());
						}
					} catch (DatatabaseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				break;
				
				case 3:{
					System.out.println("Enter Employee id");
					int empID=Integer.parseInt(br.readLine());
					try {
						String msg=empService.deleteEmployee(empID);
						System.out.println(msg);
					} catch (DatatabaseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
				
				case 4:{
					 
					System.out.println("Enter Employee id");
					int empID=Integer.parseInt(br.readLine());
					System.out.println("Enter Employee name");
					String empName=br.readLine();
					System.out.println("Enter Employee salary");
					float empSalary=Float.parseFloat(br.readLine());
					Employee employee=new Employee(empID,empName,empSalary);
					try {
						String msg=empService.saveEmployee(employee);
						System.out.println(msg);
					} catch (DatatabaseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				break;
				
				case 5:{
					System.out.println("Enter Employee id whose values you want to update");
					int empID=Integer.parseInt(br.readLine());
					System.out.println("Enter Employee name(if same then enter the current name)");
					String empName=br.readLine();
					System.out.println("Enter Employee new salary");
					float empSalary=Float.parseFloat(br.readLine());
					Employee employee=new Employee(empID,empName,empSalary);
					try {
						String msg=empService.updateEmployee(employee);
						System.out.println(msg);
					} catch (DatatabaseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
				
				case 6:{
					System.exit(0);
				}
				break;

				default:
					System.out.println("Invalid Choice.");
					break;
				}
			} catch (NumberFormatException | IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
