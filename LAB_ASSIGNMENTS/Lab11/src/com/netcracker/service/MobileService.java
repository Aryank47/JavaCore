package com.netcracker.service;

import java.util.List;

import com.netcracker.customexception.CustomException;
import com.netcracker.dto.Customer;
import com.netcracker.dto.Mobile;

public interface MobileService {
	public int insertPurchaseDetails(Customer customer)throws CustomException;
	public int updateMobileQuantity(int quantity,Customer customer)throws CustomException;
	public List<Mobile> viewAll()throws CustomException;
	public int deleteMobile(int mobileId)throws CustomException;
	public List<Mobile> searchOnPriceRange(double lowerPriceRange,double upperPriceRange)throws CustomException;
	public boolean verifyCustomer(Customer customer) throws CustomException;
}
