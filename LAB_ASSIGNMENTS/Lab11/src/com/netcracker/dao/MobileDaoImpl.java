package com.netcracker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.netcracker.allqueries.Query;
import com.netcracker.customexception.CustomException;
import com.netcracker.dbutil.DatabaseUtility;
import com.netcracker.dto.Customer;
import com.netcracker.dto.Mobile;

public class MobileDaoImpl implements MobileDao {

	@Override
	public int insertPurchaseDetails(Customer customer) throws CustomException {
		// TODO Auto-generated method stub
		int count=0;
		Connection connection=DatabaseUtility.getConnection();
		try {
			PreparedStatement statement=connection.prepareStatement(Query.INSERT);
			statement.setString(1, customer.getName());
			statement.setString(2, customer.getEmail());
			statement.setString(3, customer.getContact());
			statement.setDate(4,customer.getPurchaseDate());
			statement.setInt(5,customer.getMobileId());
			count=statement.executeUpdate();
			connection.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new CustomException(e.getMessage());
		}finally {
			DatabaseUtility.releaseConnection();
		}
		return count;
	}

	@Override
	public int updateMobileQuantity(int quantity,Customer customer) throws CustomException {
		// TODO Auto-generated method stub
		int count=0;
		Connection connection=DatabaseUtility.getConnection();
		try {
			if(quantity==0) {
				throw new CustomException("Please change quantity.");
			}
			else {
			PreparedStatement statement=connection.prepareStatement(Query.UPDATE);
			statement.setInt(1,quantity);
			statement.setInt(2,customer.getMobileId() );
			count=statement.executeUpdate();
			connection.commit();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new CustomException(e.getMessage());
		}finally {
			DatabaseUtility.releaseConnection();
		}
		return count;
	}

	@Override
	public List<Mobile> viewAll() throws CustomException {
		Connection connection=DatabaseUtility.getConnection();
		List<Mobile> mob=new LinkedList<Mobile>();
		Mobile mobile=null;
		try {
			PreparedStatement statement=connection.prepareStatement(Query.GETALL);
			ResultSet res=statement.executeQuery();
			while(res.next()) {
				mobile=new Mobile(res.getInt(1),res.getString(2),res.getDouble(3),res.getInt(4));
				mob.add(mobile);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new CustomException(e.getMessage());
		}finally {
			DatabaseUtility.releaseConnection();
		}
		
		return mob;
	}

	@Override
	public int deleteMobile(int mobileId) throws CustomException {
		int count=0;
		Connection connection=DatabaseUtility.getConnection();
		try {
			PreparedStatement statement=connection.prepareStatement(Query.DELETE);
			statement.setInt(1,mobileId);
			count=statement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			throw new CustomException(e.getMessage());
		}finally {
			DatabaseUtility.releaseConnection();
		}
		
		return count;
	}

	@Override
	public List<Mobile> searchOnPriceRange(double lowerPriceRange, double upperPriceRange) throws CustomException {
		Connection connection=DatabaseUtility.getConnection();
		List<Mobile> mob=new LinkedList<Mobile>();
		Mobile mobile=null;
		try {
			PreparedStatement statement=connection.prepareStatement(Query.SEARCH);
			statement.setDouble(1,lowerPriceRange);
			statement.setDouble(2,upperPriceRange);
			ResultSet res=statement.executeQuery();
			while(res.next()) {
				double price=res.getDouble(3);
				if(price >=lowerPriceRange & price <upperPriceRange) {
					mobile=new Mobile(res.getInt(1),res.getString(2),res.getDouble(3),res.getInt(4));
					mob.add(mobile);
				}
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new CustomException(e.getMessage());
		}finally {
			DatabaseUtility.releaseConnection();
		}
		
		return mob;
	}

}
