package com.netcracker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.netcracker.allquery.Query;
import com.netcracker.customexception.DatatabaseException;
import com.netcracker.dbutil.DatabaseUtility;
import com.netcracker.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public Employee getEmployeeByID(int eid) throws DatatabaseException {
		// TODO Auto-generated method stub
		Connection connection=DatabaseUtility.getDBConnection();
		Employee employee=null;
		try {
			
			PreparedStatement statement=connection.prepareStatement(Query.GETBYID);
			statement.setInt(1, eid);
			ResultSet res=statement.executeQuery();
			res.next();
			//System.out.println(res.getInt(1)+res.getString(2)+res.getFloat(3));
			employee=new Employee(res.getInt(1),res.getString(2),res.getFloat(3));
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new DatatabaseException(e.getMessage());
		}
		DatabaseUtility.releaseConnection();
		return employee;
	}

	@Override
	public String saveEmployee(Employee employee) throws DatatabaseException {
		// TODO Auto-generated method stub
		Connection connection=DatabaseUtility.getDBConnection();
		try {
			PreparedStatement statement=connection.prepareStatement(Query.SAVEEMP);
			statement.setInt(1,employee.getId());
			statement.setString(2, employee.getName());
			statement.setFloat(3, employee.getSalary());
			statement.executeUpdate();
			connection.commit();
		}
		catch(SQLException e) {
			throw new DatatabaseException(e.getMessage());
		}
		DatabaseUtility.releaseConnection();
		return "Record Entered Successfully";
	}

	@Override
	public List<Employee> getAllEmployee() throws DatatabaseException {
		// TODO Auto-generated method stub
		Connection connection=DatabaseUtility.getDBConnection();
		List<Employee> emp=new LinkedList<Employee>();
		Employee employee=null;
		try {
			PreparedStatement statement=connection.prepareStatement(Query.GETALL);
			ResultSet res=statement.executeQuery();
			while(res.next()) {
				employee=new Employee(res.getInt(1),res.getString(2),res.getFloat(3));
				emp.add(employee);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new DatatabaseException(e.getMessage());
		}
		DatabaseUtility.releaseConnection();
		return emp;
	}

 	@Override
	public String deleteEmployee(int eid) throws DatatabaseException {
		// TODO Auto-generated method stub
 		Connection connection=DatabaseUtility.getDBConnection();
		try {
			PreparedStatement statement=connection.prepareStatement(Query.DELETEEMP);
			statement.setInt(1,eid);
			statement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			throw new DatatabaseException(e.getMessage());
		}
		DatabaseUtility.releaseConnection();
		return "Record Deleted Successfully";
	}

	@Override
	public String updateEmployee(Employee employee) throws DatatabaseException {
		// TODO Auto-generated method stub
		Connection connection=DatabaseUtility.getDBConnection();
		try {
			PreparedStatement statement=connection.prepareStatement(Query.UPDATEEMP);
			statement.setString(1, employee.getName());
			statement.setFloat(2, employee.getSalary());
			statement.setInt(3, employee.getId());
			statement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			throw new DatatabaseException(e.getMessage());
		}
		DatabaseUtility.releaseConnection();
		return "Record successfully updated";
	}

}
