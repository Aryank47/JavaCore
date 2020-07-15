package com.netcracker.dao;

import java.util.List;

import com.netcracker.customexception.CustomException;
import com.netcracker.dto.Customer;
import com.netcracker.dto.Mobile;

public interface MobileDao {
	
	public int insertPurchaseDetails(Customer customer)throws CustomException;
	public int updateMobileQuantity(int quantity,Customer customer)throws CustomException;
	public List<Mobile> viewAll()throws CustomException;
	public int deleteMobile(int mobileId)throws CustomException;
	public List<Mobile> searchOnPriceRange(double lowerPriceRange,double upperPriceRange)throws CustomException;
	

}
