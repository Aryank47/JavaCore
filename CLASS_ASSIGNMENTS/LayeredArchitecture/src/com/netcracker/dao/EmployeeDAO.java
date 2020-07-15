package com.netcracker.dao;

import java.util.List;

import com.netcracker.customexception.DatatabaseException;
import com.netcracker.dto.Employee;

public interface EmployeeDAO {
	
	public Employee getEmployeeByID(int eid)throws DatatabaseException;
	
	public String saveEmployee(Employee employee)throws DatatabaseException;
	
	public List<Employee> getAllEmployee()throws DatatabaseException;
	
	public String deleteEmployee(int eid)throws DatatabaseException;
	
	public String updateEmployee(Employee employee)throws DatatabaseException;

}
