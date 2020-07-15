package com.netcracker.service;

import java.util.List;

import com.netcracker.customexception.DatatabaseException;
import com.netcracker.dao.EmployeeDAO;
import com.netcracker.dao.EmployeeDAOImpl;
import com.netcracker.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO empDao=new EmployeeDAOImpl();//service is using DAO object to communicate with DB

	@Override
	public Employee getEmployeeByID(int eid) throws DatatabaseException {

		
		return empDao.getEmployeeByID(eid);
	}

	@Override
	public String saveEmployee(Employee employee) throws DatatabaseException {
		
		return empDao.saveEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() throws DatatabaseException {
		
		return empDao.getAllEmployee();
	}

	@Override
	public String deleteEmployee(int eid) throws DatatabaseException {
		return empDao.deleteEmployee(eid);
	}

	@Override
	public String updateEmployee(Employee employee) throws DatatabaseException {
		
		return empDao.updateEmployee(employee);
	}

}
